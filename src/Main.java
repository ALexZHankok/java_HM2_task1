public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2499; // стоимость билета
        int oneMile = 20; // 1 миля за 20 рублей
        int sumMileCust = ticketPrice / oneMile; //сумма миль для зарегестрированного пользвателя
        int sumMileNotCust = 0; //сумма миль для незарегистрированного пользователя
        boolean isCustomer = true;

        System.out.println("Количество начисленных миль за купленный билет:");

        if (isCustomer) {
            System.out.println((sumMileCust) + " мили начислено успешно.");
        }

        else{
                System.out.println((sumMileNotCust) + "Незарегистрированным пользователям бонусы не начисляются. Станьте участником бонусной программы прямо сейчас!");
            }

        if (ticketPrice < 20) {
            System.out.println("Сумма покупки мала.");
        }

        }

    }
