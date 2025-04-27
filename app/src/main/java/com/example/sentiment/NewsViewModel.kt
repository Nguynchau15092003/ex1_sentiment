package com.example.sentiment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn

class NewsViewModel : ViewModel() {

    val news = Pager(PagingConfig(pageSize = 20)) {
        NewsPagingSource(RetrofitInstance.api, "b3edd4e4855448fea15247a63f1bdea0")
    }.flow.cachedIn(viewModelScope)
}
