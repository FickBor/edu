package org.shenit.tutorial.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.shenit.tutorial.android.asynccall.AsyncCallExamplesActivity;
import org.shenit.tutorial.android.dataproc.DataProcessExamplesActivity;
import org.shenit.tutorial.android.dataprovider.DataProviderExamplesActivity;
import org.shenit.tutorial.android.drawable.DrawableMainActivity;
import org.shenit.tutorial.android.fragment.FragmentExamplesActivity;
import org.shenit.tutorial.android.list.ListExamplesActivity;
import org.shenit.tutorial.android.menu.MenuExamplesActivity;
import org.shenit.tutorial.android.pager.PagerExamplesActivity;
import org.shenit.tutorial.android.recyclerview.RecyclerViewExamplesActivity;
import org.shenit.tutorial.android.search.SearchExamplesActivity;
import org.shenit.tutorial.android.serialization.SerializationExamplesActivity;
import org.shenit.tutorial.android.services.ServiceExamplesActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.bind(this, R.id.interact_example_link, InteractExampleActivity.class);
        Utils.bind(this, R.id.fragment_examples_link, FragmentExamplesActivity.class);
        Utils.bind(this, R.id.list_examples_link, ListExamplesActivity.class);
        Utils.bind(this, R.id.drawable_examples_link, DrawableMainActivity.class);
        Utils.bind(this, R.id.async_call_examples_link, AsyncCallExamplesActivity.class);
        Utils.bind(this, R.id.act_life_cycle_example_link, ActivityLifeCycleExampleActivity.class);
        Utils.bind(this, R.id.serialization_examples_link,SerializationExamplesActivity.class);
        Utils.bind(this, R.id.data_process_examples_link, DataProcessExamplesActivity.class);
        Utils.bind(this, R.id.menu_examples_link, MenuExamplesActivity.class);
        Utils.bind(this, R.id.data_provider_examples_link, DataProviderExamplesActivity.class);
        Utils.bind(this, R.id.pager_examples_link, PagerExamplesActivity.class);
        Utils.bind(this, R.id.return_result_example_link, ReturnResultActivity.class);
        Utils.bind(this, R.id.recycler_view_examples_link,RecyclerViewExamplesActivity.class);
        Utils.bind(this,R.id.search_examples_link, SearchExamplesActivity.class);
        Utils.bind(this,R.id.service_examples_link, ServiceExamplesActivity.class);
    }
}
