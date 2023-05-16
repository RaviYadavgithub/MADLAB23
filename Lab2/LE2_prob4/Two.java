class Two extends One{
    int t;
    public Two(int x,int t){
        super(x);
        this.t=t;
    }
    public void show(){
        System.out.println("X = "+ x+" and t = "+t);
    }
}