package mishka.ko.model;

import android.content.Context;
import android.content.Intent;

import mishka.ko.controller.ContestController;

public class ContestTypeSelect {
    public void onTypeSelected(ContestData.ContestType type, Context context){
        ContestData contestData = new ContestData(type);
        Intent intent = new Intent(context, ContestController.class);
        intent.putExtra("contest_type", contestData);
        context.startActivity(intent);
    }
}
