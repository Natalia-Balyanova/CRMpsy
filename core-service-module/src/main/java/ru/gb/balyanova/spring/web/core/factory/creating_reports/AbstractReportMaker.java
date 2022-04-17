package ru.gb.balyanova.spring.web.core.factory.creating_reports;

import ru.gb.balyanova.spring.web.core.dtos.ClientDto;

import java.time.LocalDate;
import java.util.List;

public abstract class AbstractReportMaker {

    public final void makeReport(String name, List<ClientDto> clients, Object... objects) {
        makeHeader(objects);
        makeBody(clients);
        makeFooter(name);
    }

    protected abstract void makeHeader(Object... objects);

    protected abstract void makeBody(List<ClientDto> clients);

    public final void makeFooter(String name){
        LocalDate currentDate = LocalDate.now();
        System.out.println("Report created by " + name + " Date: [ "+ currentDate + " ]");
    };
}
