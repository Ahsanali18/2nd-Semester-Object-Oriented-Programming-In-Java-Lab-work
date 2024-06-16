package Classes_Relations;
import java.util.ArrayList;

class MiningRig {
    private int rigTemp;
    private String coinType;

    public MiningRig(String coinType, int rigTemp) {
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

class Miner {
    private String minerName;
    private ArrayList<MiningRig> miningRigs = new ArrayList<>(); // Initialize ArrayList upon declaration

    public Miner(String minerName) {
        this.minerName = minerName;
    }

    public void addMiningRig(MiningRig miningRig) {
        miningRigs.add(miningRig);
    }

    public ArrayList<MiningRig> getMiningRigs() {
        return miningRigs;
    }

    public String getMinerName() {
        return minerName;
    }
}

public class CoinMiner {
    public static void main(String[] args) {
        Miner miner = new Miner("XYZ");

        // Create MiningRigs
        MiningRig rig1 = new MiningRig("Bitcoin", 70);
        MiningRig rig2 = new MiningRig("Ethereum", 60);
        MiningRig rig3 = new MiningRig("Litecoin", 50);

        // Add MiningRigs to Miner's ArrayList
        miner.addMiningRig(rig1);
        miner.addMiningRig(rig2);
        miner.addMiningRig(rig3);

        // Use the ArrayList directly to display miner's mining rigs
        System.out.println("Mining Rigs of " + miner.getMinerName() + ":");
        for (MiningRig rig : miner.getMiningRigs()) {
            System.out.println("Coin Type: " + rig.getCoinType() + ", Temperature: " + rig.getRigTemp());
        }
    }
}
