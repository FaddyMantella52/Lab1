public class Elektronik_Shop {
    public int billigste(int[] tastatur){
        int result = Integer.MAX_VALUE;
        for(int i=0; i < tastatur.length; i++){
            if(tastatur[i] < result){
                result = tastatur[i];
                }
        }
        return result;
    }

    public int teuerste(int[] tastatur, int[] USB){
        int result1 = Integer.MIN_VALUE;
        int result2 = Integer.MIN_VALUE;
        for(int i=0; i < tastatur.length; i++){
            if (tastatur[i] > result1){
                result1 = tastatur[i];
            }
        }
        for(int i=0; i< USB.length; i++){
            if(USB[i] > result2){
                result2 = USB[i];
            }
        }
        if(result1 < result2){
            return result2;
        }
        else return result1;
    }

    public int teursteMarkus(int[] USB , int budget){
        int result = Integer.MIN_VALUE;
        for(int i =0; i< USB.length; i++){
            if(result < USB[i] && USB[i] <= budget){
                result = USB[i];
            }
        }
        return result;
    }

    public int budgetMarkus(int[] tastatur,int[] USB, int budget){
        int maxAusgegeben = -1;

        for (int tastaturPreis : tastatur){
            for (int USBPreis : USB){
                int ganzeKosten = tastaturPreis + USBPreis;
                if (ganzeKosten <= budget && ganzeKosten > maxAusgegeben){
                    maxAusgegeben = ganzeKosten;
                }
            }
        }
        return maxAusgegeben;
    }
}
