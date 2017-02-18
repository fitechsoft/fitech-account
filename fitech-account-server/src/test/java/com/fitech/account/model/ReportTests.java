package com.fitech.account.model;


import com.fitech.account.item.*;
import com.fitech.ledger.model.LedgerLineTemplate;
import com.fitech.ledger.model.LedgerReportTemplate;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by chun on 2017/2/17.
 */
public class ReportTests {


    @Test
    public void shouldGenerateExpectedReportTest() {

        LineReportTemplate reportTplDepositStock = new LedgerReportTemplate();
        reportTplDepositStock.setName("RPT_DEPOSIT_STOCK");
        reportTplDepositStock.setDescription("存款余额表");


        LineTemplate rowTplDepositStock = new LedgerLineTemplate();
        rowTplDepositStock.setName("ROW_DEPOSIT_STOCK");
        rowTplDepositStock.setDescription("存款余额行");


        IDNumberItem fieldID = new IDNumberItem();
        fieldID.setName("IDTYPE_ID");
        fieldID.setDescription("个人证件号码");
        fieldID.setFieldValue("102938374747887388");

        Assertions.assertThat(!fieldID.validate());

        DateItem fieldLastOp = new GenericDateItem();
        fieldLastOp.setName("LASTBUS_DATE");
        fieldLastOp.setDescription("最后一次操作时间");
        fieldLastOp.setFieldValue(new Date());

        assertThat(fieldLastOp.validate());

        CurrencyItem fieldBalance = new CurrencyItem();
        fieldBalance.setName("DEP_BALANCE");
        fieldBalance.setDescription("存款余额");
        fieldBalance.setFieldValue(199838.0);
        System.out.println(fieldBalance.getFormatted());

        StringItem fieldSubName = new GenericStringItem();
        fieldSubName.setName("DEP_SUBJECTNAME");
        fieldSubName.setDescription("存款主体名称");

        fieldSubName.setFieldValue(null);
        Assertions.assertThat(!fieldSubName.validate());

        rowTplDepositStock.addItem(fieldID);
        rowTplDepositStock.addItem(fieldLastOp);
        rowTplDepositStock.addItem(fieldBalance);
        rowTplDepositStock.addItem(fieldSubName);

        LineReport report = null;

        reportTplDepositStock.setLineTemplate(rowTplDepositStock);

        try {
            ReportLine row1 = reportTplDepositStock.getLineTemplate().generateLineInstance();
            ReportLine row2 = reportTplDepositStock.getLineTemplate().generateLineInstance();
            ReportLine row3 = reportTplDepositStock.getLineTemplate().generateLineInstance();

            report = reportTplDepositStock.createReport();

            report.getLines().add(row1);
            report.getLines().add(row2);
            report.getLines().add(row3);


        } catch (LineGenerationException e) {
            e.printStackTrace();
        }

        assertThat(report.getLines()).isNotNull();
    }

}
