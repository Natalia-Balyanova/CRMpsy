package ru.gb.CRMpsy.factory.creating_reports;

import ru.gb.CRMpsy.dtos.ClientDto;

import java.util.List;

public class BirthdayReport extends AbstractReportMaker {
    @Override
    protected void makeHeader(Object... objects) {
        System.out.println("Happy Birthday Reports");
    }

    @Override
    protected void makeBody(List<ClientDto> clients) {
        System.out.println("Happy Birthday letters send : " + clients);
    }
}
