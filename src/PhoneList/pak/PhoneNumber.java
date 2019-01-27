package PhoneList.pak;

public class PhoneNumber {
    private String _Number;
    private String _NumberDescription;


    public PhoneNumber(String _inputString){
    String str="+";
    int j=0,k=0,l=11;
        if(_inputString.charAt(0)=='8'){str="+7";k=1;l=10;}
        for (int i=k; i<_inputString.length();i++){
            if(_inputString.charAt(i)>='0' & _inputString.charAt(i)<='9'){//is a number
              str=str+_inputString.charAt(i);j++;
            }
            if (j>=l) break;
        }
    this._Number=str;
    this._NumberDescription="Mobile";
    }
/***********************************************************************************/
    public String get_Number(){return _Number;}
/***********************************************************************************/
    public String get_formattedNumber(){
        String str="";
        for (int i=0; i<this._Number.length();i++){
            str=str+this._Number.charAt(i);
            if(i==1)str=str+'(';
            if(i==4)str=str+')';
            if(i==7|i==9)str=str+'-';
        }
    return str;
    }
/***********************************************************************************/
    public void set_NumberDescription(String Description){
        this._NumberDescription=Description;
    }
/***********************************************************************************/
    public String get_NumberDescription(){
        return this._NumberDescription;
    }

}
