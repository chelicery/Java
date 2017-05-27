public class RnaTranscription {
    public String transcribe(String dnaStrand) {
        String transcripted = "";
        if(dnaStrand.length() <= 0) {
            return "";
        } else {
            for(String sign : dnaStrand.split("")){
                switch(sign) {
                    case ("A"):
                        transcripted += "U";
                        break;
                    case ("C"):
                        transcripted += "G";
                        break;
                    case ("G"):
                        transcripted += "C";
                        break;
                    case ("T"):
                        transcripted += "A";
                        break;
                    default:
                        break;
                }
                }
            }
            return  transcripted;
        }
        }
