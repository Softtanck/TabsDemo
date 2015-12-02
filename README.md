# TabsDemo
TabLayout api

### ReadMe ###
在setupWithViewPager中进行判断了viewpager是否设置了adapter.
其次并自动调用了setTabsFromPagerAdapter,这也是为什么要判断是否设置了,因为它直接从Viewpager中拿到adpaer去设置的setTabsFromPagerAdapter

- tabIndicatorHeight:设置指示器高度
- tabIndicatorColor:设置指示器颜色
- tabPadding:设置文字距离tab的Padding
- tabTextColor:设置文本颜色
- tabSelectedTextColor:设置选择文本颜色
- tabMinWidth:最小宽度
- tabBackground:Tab背景颜色(ID)@color/colorAccent
