package Validators;

import Objects.Remedy;

public class ValidateRemedy {

    private Remedy remedy;

    public Remedy validateRemedyName(Remedy remedy) {
        try {
            if (remedy.getName().length() > 5 && remedy.getName().length() < 50) {
                return this.remedy = remedy;
            }
        } catch (Exception e) {

        }
        return null;
    }

    public Remedy getRemedy() {
        return this.remedy;
    }

    public void setRemedy(Remedy remedy) {
        this.remedy = remedy;
    }
}
