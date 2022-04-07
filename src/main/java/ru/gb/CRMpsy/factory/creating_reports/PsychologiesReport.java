package ru.gb.CRMpsy.factory.creating_reports;

import ru.gb.CRMpsy.dtos.ClientDto;

import java.util.List;

public class PsychologiesReport extends AbstractReportMaker{
    @Override
    protected void makeHeader(Object... objects) {
        System.out.println("Consultation`s report " + objects[0]);
    }

    @Override
    protected void makeBody(List<ClientDto> clients) {
        System.out.println("Consultation with psychologist bought by client: " + clients);
    }
}
