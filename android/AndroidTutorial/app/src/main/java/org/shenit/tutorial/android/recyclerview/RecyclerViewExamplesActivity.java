package org.shenit.tutorial.android.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.shenit.tutorial.android.R;
import org.shenit.tutorial.android.TutorialUtils;

public class RecyclerViewExamplesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_examples);
        TutorialUtils.bind(this, R.id.linear_layout_manager_example, RecyclerViewLinearLayoutExampleActivity.class);
        TutorialUtils.bind(this, R.id.grid_layout_manager_example, RecyclerViewGridLayoutExample.class);
        TutorialUtils.bind(this, R.id.staggered_grid_layout_manager_example, RecyclerViewStaggeredGridLayoutExample.class);
        TutorialUtils.bind(this, R.id.recycler_view_context_menu_example, RecyclerViewContextMenuExampleActivity.class);
    }
}
