package Com.xsushirollx.sushibyte.xsushirollx.service;

public class Helper {

//    public static void main(String[] args) {
//Helper h = new Helper();
//
//        Double d = 985.42831250;
////        double roundDbl = Math.round(d*100.00)/100.00;
//        System.out.println(Math.round(d));
//
//
//        System.out.println("Rounded Double value: "+h.roundTwoPlaces(d,5d));
//
//    }


   public Boolean isDouble(String string){
        Boolean isDouble;
        try {
            Double.parseDouble(string);
            isDouble = true;
        }catch (NumberFormatException e){
            isDouble = false;
        }
        return isDouble;
    }


    public Double roundTwoPlaces(Double dub,Double places){
        Double dec = Math.pow(10,places);
        return  Math.round(dub * dec)/dec;
    }
}
