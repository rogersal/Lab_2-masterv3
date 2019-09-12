package cs301.birthdaycake;

public class CakeController {
    private CakeView kla;
    private CakeModel mod;
    public CakeController(CakeView k){
        kla = k;
        mod = k.getCakeModel();
    }
}
