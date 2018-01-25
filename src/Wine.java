public class Wine {

    private String producent;

    public Wine(String producent) {
        this.producent = producent;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public void whoAmI(){
        System.out.println("Im wine im healthier");
    }
}
