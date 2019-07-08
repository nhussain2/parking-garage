
import java.util.Scanner;

public class PrattParkingGarage {

static Scanner sc = new Scanner(System.in);

// Naveed Hussain , Programmer

public static void main(String args[]) {

// the local variable declared and initialized

char answer = 'Y', specEvent = 'N', rateCode = '\0';

int ticketNum = 0;

int timeIn = 0, timeOut = 0, timeDiff = 0;

double amountTendered = 0.0, changeDue = 0.0;

double flatFee = 0.0, monthFee = 0.0;

double EXTRA_CHARGE = 0.0;

double coupon = 0.0, tip = 0.0;

double flatTax = 3.0, totalDueFromCust = 0.0;

System.out.println("");

System.out.println("");

System.out.println("*******************************************");

System.out.println("------------PrattParkingGarage-------------");

System.out.println("*******************************************");

System.out.println("");

System.out.println("");

double accumulativeAmount = 0.0;

double accumulativeTax = 0.0;

double accumulativeTip = 0.0;

double totalCustomersWithCoupon = 0;

while (answer == 'Y' || answer == 'y') {

System.out.println("-------------------Menu------------------");

System.out.println("data entry process : enter each of these");

System.out.println("customer ticket number ->");

ticketNum = sc.nextInt();

System.out.println("ticket Number " + (ticketNum));

System.out.println("time in (military)");

timeIn = sc.nextInt();

System.out.println("time out (military)");

timeOut = sc.nextInt();

timeDiff = timeOut - timeIn;

System.out.println("time difference " + (timeDiff));

System.out.println("rate code: (F or M))");

rateCode = sc.next().charAt(0);

System.out.println("rate code: " + (rateCode));

if (rateCode == 'F') {

flatFee = 10.0;

totalDueFromCust = flatFee;

}

if (rateCode == 'M') {

monthFee = 90.0;

totalDueFromCust = monthFee;

// monthly fee is deferred

totalDueFromCust = 0;

}

System.out.println("tip Amount");

tip = sc.nextDouble();

System.out.printf("tip: $%.2f\n", tip);

totalDueFromCust += tip;

System.out.printf("flat Tax: $%.2f\n", flatTax);

totalDueFromCust += flatTax;

System.out.println("Special Event(Y or N)");

specEvent = sc.next().charAt(0);

if (specEvent == 'Y')

EXTRA_CHARGE = 10;

totalDueFromCust += EXTRA_CHARGE;

System.out.println("Coupon Amount");

coupon = sc.nextDouble();

if (coupon > 0.0) {

totalCustomersWithCoupon++;

}

totalDueFromCust -= coupon;

System.out.printf("total Charges: $%.2f\n", totalDueFromCust);

System.out.println("amount tendered from customer");

amountTendered = sc.nextDouble();

changeDue = amountTendered - totalDueFromCust;

System.out.printf("change: $%.2f\n", changeDue);

System.out.println("*******************************************");

System.out.println("run again(Y or N)");

answer = sc.next().charAt(0);

accumulativeAmount += totalDueFromCust;

accumulativeTax +=flatTax;

accumulativeTip += tip;

// reset all the variables before next loop (customer)

// by assigning a zero to appropriate variable

ticketNum = 0;

timeIn = 0;

timeOut = 0;

timeDiff = 0;

rateCode = '\0';

totalDueFromCust = 0.0;

specEvent = 'N';

tip = 0;

coupon = 0;

changeDue = 0.0;

amountTendered = 0.0;

flatFee = 0.0;

monthFee = 0.0;

EXTRA_CHARGE = 0.0;

System.out.println("*******************************************");

} // end loop

System.out.println("Accumulative Amount is:= " + accumulativeAmount);

System.out.println("Accumulative tip is:= " + accumulativeTip);

System.out.println("Accumulative tax is:= " + accumulativeTax);

System.out.println("Customer that Used Coupons:= " + totalCustomersWithCoupon);

}// end main

}// end class


