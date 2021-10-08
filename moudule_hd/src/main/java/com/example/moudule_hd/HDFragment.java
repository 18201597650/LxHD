package com.example.moudule_hd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.export_find.FindServiceUtil;
import com.example.export_hd.router.HdRouterTable;
import com.example.export_suprise.SupriseServiceUtil;

/**
 * Time:2021/10/7
 * Author:liuxiong
 * Description:
 */
@Route(path = HdRouterTable.PATH_FRAGMENT_HD)
public class HDFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private Button mBtnJumpDetail,mBtnJumpFindDetail,mBtnGetFindData,mBtnGetSupriseData;
    private TextView mTvGetContent,mTvGetSupriseContent;

    public HDFragment() {
        // Required empty public constructor
    }

    public static HDFragment newInstance(String param1, String param2) {
        HDFragment fragment = new HDFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_hd, container, false);
        mBtnJumpDetail=view.findViewById(R.id.mBtnJumpDetail);
        mBtnJumpFindDetail=view.findViewById(R.id.mBtnJumpFindDetail);
        mBtnGetFindData=view.findViewById(R.id.mBtnGetFindData);
        mTvGetContent=view.findViewById(R.id.mTvGetContent);
        mBtnGetSupriseData=view.findViewById(R.id.mBtnGetSupriseData);
        mTvGetSupriseContent=view.findViewById(R.id.mTvGetSupriseContent);


        mBtnJumpDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HDDetailActivity.jump(getActivity());
            }
        });
        mBtnJumpFindDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FindServiceUtil.getService().jumpToFindActivity(getActivity());
            }
        });

        mBtnGetFindData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTvGetContent.setText(FindServiceUtil.getService().getProductCountInCart().productCount+"");
            }
        });
        mBtnGetSupriseData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTvGetSupriseContent.setText(SupriseServiceUtil.getService().getSupriseInfo().supriseInfo);
            }
        });

        return view;
    }
}
