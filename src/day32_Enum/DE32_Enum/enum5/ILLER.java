package day32_Enum.DE32_Enum.enum5;

public enum ILLER {
    ADANA("01"),
    ADIYAMAN("02"),
    ANKARA("06"),
    ISTANBUL("34"),
    IZMIR("35"),
    SANLURFA("63"),
    TRABZON("61");

    private final String plkCode;

    ILLER(String plkCode) { // constructor
        this.plkCode = plkCode;
    }

    public String getPlkCode() { // getter
        return plkCode;
    }

    public static ILLER getIL(String pKodu){  // method
        ILLER il =null;
        for (ILLER val:ILLER.values()){  //iller class indaki verileri bir dizi ye aktarildi
            //runner da sorulan il bu dizi icerisinde ise gönder yoksa null gönder
            if (val.getPlkCode().equals(pKodu)) il=val;
        }
        return il;
    }
}
