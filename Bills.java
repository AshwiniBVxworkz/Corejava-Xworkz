class Bills{	
	static String acountHolderName="Joy";
	static String acountNumber ="0000-00-0000";
	static String amountNowDue="Rs430.45";
	static String billingDate="23/06/2022";
	static String dueDate="26/12/2022";
	static double previousBalance =437.83;
	static double currentCharges =108.3;
	static double actualCharges =546.13;
	
	public static void main(String Bills[]){
		System.out.println("Account HolderName : " +acountHolderName);
		System.out.println("Account Number  :  " + acountNumber);
		System.out.println("Amount Due Date :  " +amountNowDue);
		System.out.println("Billing Date : " + billingDate);
		System.out.println("Due Date : " + dueDate);
		System.out.println("Previous Balance : " + previousBalance);
		System.out.println("Current Charges : " + currentCharges);
		System.out.println("Actual Charges : " + actualCharges);
}
}