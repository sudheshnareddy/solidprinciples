package solid;

class ExamFeeInfo {
    public void regfeedate() {
        System.out.println("pay fee by Jan");
    }

    public void regfeeprice() {
        System.out.println("pay Rs.1800");
    }

    public void supleefeedate() {
        System.out.println("pay fee by Feb");
    }

    public void supleeprice() {
        System.out.println("pay Rs.1000/subj");
    }
}

class RegStudent extends ExamFeeInfo {
    public RegStudent() {
        super.regfeedate();
        super.regfeeprice();
    }
}

class FailedStudent extends ExamFeeInfo {
    public FailedStudent() {
        super.regfeedate();
        super.regfeeprice();
        super.supleefeedate();
        super.supleeprice();
    }
}

class liskovbad {
    public static void main(String[] args) {
        RegStudent r = new RegStudent();
        FailedStudent f = new FailedStudent();
    }
}