package com.example.android_movies_test.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.android_movies_test.BR
import com.example.android_movies_test.R
import com.example.android_movies_test.data.Ndo
import com.example.android_movies_test.databinding.ItemNestedHolderBinding
import com.pharosproduction.androidnestedrecycler.RvOnClickListener

class NestedAdapter(private val parentPosition: Int) : RecyclerView.Adapter<NestedAdapter.NestedHolder>() {

    // Variables
    private var dataList = emptyList<Ndo>()
    private lateinit var onClickListenerNested: RvOnClickListener

    // Public setter
    fun setData(dataList: List<Ndo>) {
        this.dataList = dataList
        notifyDataSetChanged()
    }

    fun setOnClickListenerNested(onClickListenerNested: RvOnClickListener) {
        this.onClickListenerNested = onClickListenerNested
    }

    // Live
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NestedHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemNestedHolderBinding>(inflater, R.layout.item_nested_holder, parent, false)
        return NestedHolder(binding, onClickListenerNested, parentPosition)
    }


    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: NestedHolder, position: Int) {
        holder.bind(dataList[position], getItemViewType(position), nestedElementPosition = position)
    }

    // Holder

    class NestedHolder(private val binding: ViewDataBinding, private val onClickListener: RvOnClickListener, private val parentPosition: Int) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        // Variables

        private var nestedElementPosition: Int = 0

        // Public

        fun bind(data: Ndo, nestedItemViewType: Int, nestedElementPosition: Int) {
            this.nestedElementPosition = nestedElementPosition
            when (1) {
                1 -> {
                    (binding as ItemNestedHolderBinding).setVariable(BR.itemNested, data)
                    binding.executePendingBindings()
                    binding.root.setOnClickListener(this)
                }
            }
        }

        override fun onClick(v: View?) {
            onClickListener.onItmClick(parentPosition, nestedElementPosition)
        }
    }
}