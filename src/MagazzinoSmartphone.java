import java.util.ArrayList;

public class MagazzinoSmartphone {
    private ArrayList<Smartphone> smartphones;
    

    public MagazzinoSmartphone() {
        smartphones = new ArrayList<Smartphone>(); // Assuming initial capacity of 10
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        this.smartphones = (ArrayList<Smartphone>) other.getSmartphones().clone();
    }


    public void addSmartphone(Smartphone smartphone) {
        smartphones.add(smartphone);
        
        
    }

    public void removeSmartphone(Smartphone smartphone) {
        smartphones.remove(smartphones.indexOf(smartphone));
    }

    public ArrayList<Smartphone> getSmartphones() {
        return smartphones;
    }


    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = null;
        boolean fatto = false;
        int i = 0;
       while (i<smartphones.size() && !fatto) { 
            if (smartphones.get(i).getBrand().equals(brand)) {
                smartphone = new Smartphone(smartphones.get(i));
                fatto = true;
            }  
        }

        return smartphone;
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        for (Smartphone i : smartphones) {
           if (i.getStorageCapacity()==storageCapacity) {
             magazzinoSmartphone.addSmartphone(i);
           } 
        }
        return magazzinoSmartphone;
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        for (Smartphone i : smartphones) {
            if (i.getPrice()<=maxPrice && i.getPrice()>=minPrice) {
              magazzinoSmartphone.addSmartphone(i);
            } 
         }
        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String result = "\nMagazzinoSmartphone:\n";
        for (Smartphone i : smartphones) {
            result+= i.toString() + "\n";
        }

        return result;
    }

    public int getCount() {
        return smartphones.size();
    }

    public boolean equals(Object obj) {
        boolean i = false;
       if (obj!= this) {
        if (obj instanceof MagazzinoSmartphone) {
            MagazzinoSmartphone g = (MagazzinoSmartphone) obj;
            i= true;
            for (int j = 0; j < smartphones.size(); j++) {
                if (!g.getSmartphones().get(j).equals(smartphones.get(j))) {
                    i=false;
                }
            }
        }
       }else{
        i=true;
       }

        return i;
    }


}