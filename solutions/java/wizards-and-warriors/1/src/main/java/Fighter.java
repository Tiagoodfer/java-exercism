class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


class Warrior extends Fighter {

        private int point = 10;

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter opponent) {
        if (opponent.isVulnerable()) {
            return 10;
        }
        return 6;
    }


    public String toString () {
        return "Fighter is a Warrior";
    }
    
}



class Wizard extends Fighter {

    private boolean spellPrepared = false;

    public void prepareSpell() {
        this.spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter opponent) {
        if (spellPrepared) {
            return 12;
        }
        return 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
