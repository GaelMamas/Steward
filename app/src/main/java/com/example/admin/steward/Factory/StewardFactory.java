package com.example.admin.steward.Factory;

import com.example.admin.steward.Components.Bowl;
import com.example.admin.steward.Components.ConsumptionBowlRecoder;
import com.example.admin.steward.Components.DreamerBowl;
import com.example.admin.steward.Components.Phial;
import com.example.admin.steward.Components.Pipe;

import java.util.HashMap;
import java.util.List;

/**
 * Created by admin on 09/09/2018.
 */

public class StewardFactory {

    private Phial mIncomePhial, mLeftOverPhial;
    private List<Bowl> mUsualExpensesBowls;
    private List<DreamerBowl> mProjectBowls;
    private Pipe mMainPipe, mDreamerPipe;

    private HashMap<Bowl, ConsumptionBowlRecoder> mConsumptionBowlRecoderHashMap;
    private HashMap<DreamerBowl, ConsumptionBowlRecoder> mConsumptionDreamBowlHashMap;

    private static StewardFactory mStewardFactory;

    private StewardFactory(List<Bowl> bowls, List<DreamerBowl> dreamerBowls){

        this.mUsualExpensesBowls = bowls;
        this.mProjectBowls = dreamerBowls;

        mIncomePhial = new Phial();
        mLeftOverPhial = new Phial();

        mMainPipe = new Pipe();
        mDreamerPipe = new Pipe();

        mConsumptionBowlRecoderHashMap = new HashMap<>();
        mConsumptionDreamBowlHashMap = new HashMap<>();

        initFactory();
    }

    public static StewardFactory getInstance(List<Bowl> bowls, List<DreamerBowl> dreamerBowls){

        if(mStewardFactory == null)
            mStewardFactory = new StewardFactory(bowls, dreamerBowls);

        return mStewardFactory;

    }

    private void initFactory(){



    }

}
