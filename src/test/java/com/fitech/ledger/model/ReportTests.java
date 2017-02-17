package com.fitech.ledger.model;


import com.fitech.account.model.*;
import com.fitech.account.model.field.*;
import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by chun on 2017/2/17.
 */
public class ReportTests {


    @Test
    public void shouldGenerateExpectedReportTest() {

        FAReportTemplate reportTplDepositStock = new FALedgerReportTemplate();
        reportTplDepositStock.setName("RPT_DEPOSIT_STOCK");
        reportTplDepositStock.setDescription("存款余额表");


        FARowTemplate rowTplDepositStock = new FALedgerRowTemplate();
        rowTplDepositStock.setName("ROW_DEPOSIT_STOCK");
        rowTplDepositStock.setDescription("存款余额行");


        FAIDField fieldID = new FAIDField();
        fieldID.setName("IDTYPE_ID");
        fieldID.setDescription("个人证件号码");
        fieldID.setFieldValue("102938374747887388");

        assertThat(!fieldID.validate());

        FADateField fieldLastOp = new FAGenericDateField();
        fieldLastOp.setName("LASTBUS_DATE");
        fieldLastOp.setDescription("最后一次操作时间");
        fieldLastOp.setFieldValue(new Date());

        assertThat(fieldLastOp.validate());

        FACurrencyField fieldBalance = new FACurrencyField();
        fieldBalance.setName("DEP_BALANCE");
        fieldBalance.setDescription("存款余额");
        fieldBalance.setFieldValue(199838.0);
        System.out.println(fieldBalance.getFormatted());

        FAStringField fieldSubName = new FAGenericStringField();
        fieldSubName.setName("DEP_SUBJECTNAME");
        fieldSubName.setDescription("存款主体名称");

        fieldSubName.setFieldValue(null);
        assertThat(!fieldSubName.validate());

        rowTplDepositStock.addFiled(fieldID);
        rowTplDepositStock.addFiled(fieldLastOp);
        rowTplDepositStock.addFiled(fieldBalance);
        rowTplDepositStock.addFiled(fieldSubName);

        FAReport report = null;

        reportTplDepositStock.setRowTemplate(rowTplDepositStock);

        try{
            FARow row1 = reportTplDepositStock.getRowTemplate().generateRowInstance();
            FARow row2 = reportTplDepositStock.getRowTemplate().generateRowInstance();
            FARow row3 = reportTplDepositStock.getRowTemplate().generateRowInstance();

            report = reportTplDepositStock.generateReport();

            report.getRows().add(row1);
            report.getRows().add(row2);
            report.getRows().add(row3);


        }catch(RowInstanceGenerationException e){
            e.printStackTrace();
        }


        assertThat(report.getRows()).isNotNull();
    }

}
