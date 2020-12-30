class DriverClass {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        println('Press 1 to get IFSC details \nPress 2 to get Bank Details')
        int option = scanner.nextInt()
        switch (option){
            case 1:
                println('Work In progress\nFeature coming soon!')
                break
            case 2:
                GetBankDetails getBankDetails = new GetBankDetails()
                getBankDetails.getDetails()
                break
            default:
                println('Wrong option')
        }
    }
}
