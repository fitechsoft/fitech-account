package com.fitech.ledger.model;


import com.fitech.account.model.field.FAField;
import com.fitech.account.model.FAFieldType;
import com.fitech.account.model.FAReportTemplate;
import com.fitech.account.model.FARowTemplate;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by chun on 2017/2/17.
 */
public class ReportTests {


    @Test
    public void shouldNotValidateWhenFirstNameEmpty() {

        FAReportTemplate reportTemplate = new FALedgerReportTemplate();
        FARowTemplate rowTemplate = new FALedgerRowTemplate();
        rowTemplate.addTypedFileds(new FAFieldType() {
            @Override
            public FAField generateFieldInstance() {
                return null;
            }
        });

        reportTemplate.setRowTemplate(new FALedgerRowTemplate());


        assertThat(rowTemplate.generateRowInstance()).isNotNull();
    }

}
