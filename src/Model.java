package sample;

public class Model {

    public void MeterToInch(View view, String meterStr){
        if(isNumeric(view.getMeter())) {
            double meter;
            double inch;
            meter = Double.parseDouble(meterStr);
            inch = Math.round(meter * 39.3701 * 1000.0) / 1000.0;
            view.setInch(String.valueOf(inch));
        }
        else
            view.MeterErr();
    }

    public void InchToMeter(View view, String inchStr){
        if(isNumeric(view.getInch())) {
            double meter;
            double inch;
            inch = Double.parseDouble(inchStr);
            meter = Math.round(inch / 39.3701 * 1000.0) / 1000.0;
            view.setMeter(String.valueOf(meter));
        }
        else
            view.InchErr();
    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}