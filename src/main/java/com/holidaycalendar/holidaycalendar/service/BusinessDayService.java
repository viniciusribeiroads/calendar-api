package com.holidaycalendar.holidaycalendar.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class BusinessDayService {

    // Método para verificar se um LocalDate é um dia útil ou não
    public boolean isDiaUtil(LocalDate date) {
        // Verifica se é sábado (DayOfWeek.SATURDAY) ou domingo (DayOfWeek.SUNDAY)
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return false; // Não é dia útil
        }

        // Pode-se adicionar aqui lógica para verificar se é feriado ou não.
        // Por exemplo, consultando uma base de dados de feriados ou usando uma API de feriados.

        return true; // É dia útil
    }
}
