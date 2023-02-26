package hw.lesson66.banksystem;

import java.math.BigDecimal;

abstract class Account {
    BigDecimal amount; //поле для текущей суммы на счете
    long account; //поле для текущего номера счета
    long clientId; //поле для номера клиента банка
}
