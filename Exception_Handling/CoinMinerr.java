package SirNaveen;

class MiningRigTempEx extends Exception {
    MiningRigTempEx(String msg) {
        super(msg);
    }
}

class MiningRig {
    private int rigTemp;
    private String coinType;

    MiningRig(String coinType, int rigTemp) {
        this.coinType = coinType;
        this.rigTemp = rigTemp;
    }

    public String getCoinType() {
        return coinType;
    }

    public int getRigTemp() {
        return rigTemp;
    }
}

class Minerr {
    private String minerName;
    private MiningRig miningRig; // Aggregation: Miner HAS-A MiningRig

    public Minerr(String minerName, MiningRig miningRig) {
        this.minerName = minerName;
        this.miningRig = miningRig;
    }

    public void checkRigTemp() throws MiningRigTempEx {
        if (miningRig.getRigTemp() < 10) {
            throw new MiningRigTempEx("Rig is too cold");
        } else if (miningRig.getRigTemp() > 80) {
            throw new MiningRigTempEx("Rig is too hot");
        } else {
            System.out.println("Rig's Temp is moderate");
        }
    }

    public String getMinerName() {
        return minerName;
    }

    // Optional: If you want to change the mining rig of an existing miner
    public void setMiningRig(MiningRig miningRig) {
        this.miningRig = miningRig;
    }
}

public class CoinMinerr {
    public static void main(String[] args) {
        MiningRig rig = new MiningRig("Ethereum", 80); // Create a MiningRig instance
        Minerr miner = new Minerr("Alice", rig); // Aggregate it within a Miner

        try {
            miner.checkRigTemp();
        } catch (MiningRigTempEx e) {
            System.out.println(e.getMessage());
        }

        System.out.println(miner.getMinerName() + " is mining " + rig.getCoinType());
    }
}
