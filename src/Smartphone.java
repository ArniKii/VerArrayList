public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private double price;

    public Smartphone(){};

    public Smartphone(String brand, String model, int storageCapacity, double price) {
        this.brand= new String(brand);
        this.model = new String(model);
        this.storageCapacity = storageCapacity;
        this.price = price;
    }

    public Smartphone(Smartphone other) {
        this(other.getBrand(), other.getModel(), other.getStorageCapacity(), other.getPrice());
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sono uno smartphone " + brand + " " + model + " con " + storageCapacity + " GB e costo " + price;
    }

    @Override
    public boolean equals(Object obj) {
        Boolean s = false;
        if (this != obj) {
            if (obj instanceof Smartphone) {
                Smartphone j = (Smartphone) obj;
                if(this.model.equals(j.getModel())){
                    s= true;
                }
            }
        }else{
            s = true;
        }
        return s;
    }
    
}
