package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.C0593g0 implements p000a.p001a.p006m.AbstractC0031c {

    /* renamed from: r0 */
    static final androidx.appcompat.widget.SearchView.C0548k f1897r0 = null;

    /* renamed from: A */
    private android.graphics.Rect f1898A;

    /* renamed from: B */
    private android.graphics.Rect f1899B;

    /* renamed from: C */
    private int[] f1900C;

    /* renamed from: D */
    private int[] f1901D;

    /* renamed from: E */
    private final android.widget.ImageView f1902E;

    /* renamed from: F */
    private final android.graphics.drawable.Drawable f1903F;

    /* renamed from: G */
    private final int f1904G;

    /* renamed from: H */
    private final int f1905H;

    /* renamed from: I */
    private final android.content.Intent f1906I;

    /* renamed from: J */
    private final android.content.Intent f1907J;

    /* renamed from: K */
    private final java.lang.CharSequence f1908K;

    /* renamed from: L */
    private androidx.appcompat.widget.SearchView.AbstractC0550m f1909L;

    /* renamed from: M */
    private androidx.appcompat.widget.SearchView.AbstractC0549l f1910M;

    /* renamed from: N */
    android.view.View.OnFocusChangeListener f1911N;

    /* renamed from: O */
    private androidx.appcompat.widget.SearchView.AbstractC0551n f1912O;

    /* renamed from: P */
    private android.view.View.OnClickListener f1913P;

    /* renamed from: Q */
    private boolean f1914Q;

    /* renamed from: R */
    private boolean f1915R;

    /* renamed from: S */
    p000a.p031h.p032a.AbstractC0231a f1916S;

    /* renamed from: T */
    private boolean f1917T;

    /* renamed from: U */
    private java.lang.CharSequence f1918U;

    /* renamed from: V */
    private boolean f1919V;

    /* renamed from: W */
    private boolean f1920W;

    /* renamed from: a0 */
    private int f1921a0;

    /* renamed from: b0 */
    private boolean f1922b0;

    /* renamed from: c0 */
    private java.lang.CharSequence f1923c0;

    /* renamed from: d0 */
    private java.lang.CharSequence f1924d0;

    /* renamed from: e0 */
    private boolean f1925e0;

    /* renamed from: f0 */
    private int f1926f0;

    /* renamed from: g0 */
    android.app.SearchableInfo f1927g0;

    /* renamed from: h0 */
    private android.os.Bundle f1928h0;

    /* renamed from: i0 */
    private final java.lang.Runnable f1929i0;

    /* renamed from: j0 */
    private java.lang.Runnable f1930j0;

    /* renamed from: k0 */
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> f1931k0;

    /* renamed from: l0 */
    private final android.view.View.OnClickListener f1932l0;

    /* renamed from: m0 */
    android.view.View.OnKeyListener f1933m0;

    /* renamed from: n0 */
    private final android.widget.TextView.OnEditorActionListener f1934n0;

    /* renamed from: o0 */
    private final android.widget.AdapterView.OnItemClickListener f1935o0;

    /* renamed from: p0 */
    private final android.widget.AdapterView.OnItemSelectedListener f1936p0;

    /* renamed from: q */
    final androidx.appcompat.widget.SearchView.SearchAutoComplete f1937q;

    /* renamed from: q0 */
    private android.text.TextWatcher f1938q0;

    /* renamed from: r */
    private final android.view.View f1939r;

    /* renamed from: s */
    private final android.view.View f1940s;

    /* renamed from: t */
    private final android.view.View f1941t;

    /* renamed from: u */
    final android.widget.ImageView f1942u;

    /* renamed from: v */
    final android.widget.ImageView f1943v;

    /* renamed from: w */
    final android.widget.ImageView f1944w;

    /* renamed from: x */
    final android.widget.ImageView f1945x;

    /* renamed from: y */
    private final android.view.View f1946y;

    /* renamed from: z */
    private androidx.appcompat.widget.SearchView.C0554p f1947z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.C0581d {

        /* renamed from: e */
        private int f1948e;

        /* renamed from: f */
        private androidx.appcompat.widget.SearchView f1949f;

        /* renamed from: g */
        private boolean f1950g;

        /* renamed from: h */
        final java.lang.Runnable f1951h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        class RunnableC0537a implements java.lang.Runnable {

            /* renamed from: b */
            final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete f1952b;

            RunnableC0537a(androidx.appcompat.widget.SearchView.SearchAutoComplete r1) {
                    r0 = this;
                    r0.f1952b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1952b
                    r0.m2204b()
                    return
            }
        }

        public SearchAutoComplete(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                int r0 = p000a.p001a.C0000a.autoCompleteTextViewStyle
                r1.<init>(r2, r3, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r1, android.util.AttributeSet r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                androidx.appcompat.widget.SearchView$SearchAutoComplete$a r1 = new androidx.appcompat.widget.SearchView$SearchAutoComplete$a
                r1.<init>(r0)
                r0.f1951h = r1
                int r1 = r0.getThreshold()
                r0.f1948e = r1
                return
        }

        private int getSearchViewTextMinWidthDp() {
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                android.content.res.Configuration r0 = r0.getConfiguration()
                int r1 = r0.screenWidthDp
                int r2 = r0.screenHeightDp
                r3 = 960(0x3c0, float:1.345E-42)
                if (r1 < r3) goto L_0x001c
                r3 = 720(0x2d0, float:1.009E-42)
                if (r2 < r3) goto L_0x001c
                int r0 = r0.orientation
                r3 = 2
                if (r0 != r3) goto L_0x001c
                r0 = 256(0x100, float:3.59E-43)
                return r0
            L_0x001c:
                r0 = 600(0x258, float:8.41E-43)
                if (r1 >= r0) goto L_0x002c
                r0 = 640(0x280, float:8.97E-43)
                if (r1 < r0) goto L_0x0029
                r0 = 480(0x1e0, float:6.73E-43)
                if (r2 < r0) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r0 = 160(0xa0, float:2.24E-43)
                return r0
            L_0x002c:
                r0 = 192(0xc0, float:2.69E-43)
                return r0
        }

        /* renamed from: a */
        boolean m2205a() {
                r1 = this;
                android.text.Editable r0 = r1.getText()
                int r0 = android.text.TextUtils.getTrimmedLength(r0)
                if (r0 != 0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                return r0
        }

        /* renamed from: b */
        void m2204b() {
                r2 = this;
                boolean r0 = r2.f1950g
                if (r0 == 0) goto L_0x0016
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                r0.showSoftInput(r2, r1)
                r2.f1950g = r1
            L_0x0016:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
                r1 = this;
                int r0 = r1.f1948e
                if (r0 <= 0) goto L_0x000d
                boolean r0 = super.enoughToFilter()
                if (r0 == 0) goto L_0x000b
                goto L_0x000d
            L_0x000b:
                r0 = 0
                goto L_0x000e
            L_0x000d:
                r0 = 1
            L_0x000e:
                return r0
        }

        @Override // androidx.appcompat.widget.C0581d, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r2)
                boolean r0 = r1.f1950g
                if (r0 == 0) goto L_0x0012
                java.lang.Runnable r0 = r1.f1951h
                r1.removeCallbacks(r0)
                java.lang.Runnable r0 = r1.f1951h
                r1.post(r0)
            L_0x0012:
                return r2
        }

        @Override // android.view.View
        protected void onFinishInflate() {
                r3 = this;
                super.onFinishInflate()
                android.content.res.Resources r0 = r3.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                int r1 = r3.getSearchViewTextMinWidthDp()
                float r1 = (float) r1
                r2 = 1
                float r0 = android.util.TypedValue.applyDimension(r2, r1, r0)
                int r0 = (int) r0
                r3.setMinWidth(r0)
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
                r0 = this;
                super.onFocusChanged(r1, r2, r3)
                androidx.appcompat.widget.SearchView r1 = r0.f1949f
                r1.m2216j()
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
                r2 = this;
                r0 = 4
                if (r3 != r0) goto L_0x003f
                int r0 = r4.getAction()
                r1 = 1
                if (r0 != 0) goto L_0x001a
                int r0 = r4.getRepeatCount()
                if (r0 != 0) goto L_0x001a
                android.view.KeyEvent$DispatcherState r3 = r2.getKeyDispatcherState()
                if (r3 == 0) goto L_0x0019
                r3.startTracking(r4, r2)
            L_0x0019:
                return r1
            L_0x001a:
                int r0 = r4.getAction()
                if (r0 != r1) goto L_0x003f
                android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
                if (r0 == 0) goto L_0x0029
                r0.handleUpEvent(r4)
            L_0x0029:
                boolean r0 = r4.isTracking()
                if (r0 == 0) goto L_0x003f
                boolean r0 = r4.isCanceled()
                if (r0 != 0) goto L_0x003f
                androidx.appcompat.widget.SearchView r3 = r2.f1949f
                r3.clearFocus()
                r3 = 0
                r2.setImeVisibility(r3)
                return r1
            L_0x003f:
                boolean r3 = super.onKeyPreIme(r3, r4)
                return r3
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean r2) {
                r1 = this;
                super.onWindowFocusChanged(r2)
                if (r2 == 0) goto L_0x0025
                androidx.appcompat.widget.SearchView r2 = r1.f1949f
                boolean r2 = r2.hasFocus()
                if (r2 == 0) goto L_0x0025
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L_0x0025
                r2 = 1
                r1.f1950g = r2
                android.content.Context r0 = r1.getContext()
                boolean r0 = androidx.appcompat.widget.SearchView.m2242a(r0)
                if (r0 == 0) goto L_0x0025
                androidx.appcompat.widget.SearchView$k r0 = androidx.appcompat.widget.SearchView.f1897r0
                r0.m2202a(r1, r2)
            L_0x0025:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
                r0 = this;
                return
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(java.lang.CharSequence r1) {
                r0 = this;
                return
        }

        void setImeVisibility(boolean r3) {
                r2 = this;
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                if (r3 != 0) goto L_0x001e
                r2.f1950g = r1
                java.lang.Runnable r3 = r2.f1951h
                r2.removeCallbacks(r3)
                android.os.IBinder r3 = r2.getWindowToken()
                r0.hideSoftInputFromWindow(r3, r1)
                return
            L_0x001e:
                boolean r3 = r0.isActive(r2)
                if (r3 == 0) goto L_0x002f
                r2.f1950g = r1
                java.lang.Runnable r3 = r2.f1951h
                r2.removeCallbacks(r3)
                r0.showSoftInput(r2, r1)
                return
            L_0x002f:
                r3 = 1
                r2.f1950g = r3
                return
        }

        void setSearchView(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1949f = r1
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
                r0 = this;
                super.setThreshold(r1)
                r0.f1948e = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    class C0538a implements android.text.TextWatcher {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1953b;

        C0538a(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1953b = r1
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r1) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                androidx.appcompat.widget.SearchView r2 = r0.f1953b
                r2.m2229b(r1)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    class RunnableC0539b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1954b;

        RunnableC0539b(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1954b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.SearchView r0 = r1.f1954b
                r0.m2214l()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    class RunnableC0540c implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1955b;

        RunnableC0540c(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1955b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.SearchView r0 = r2.f1955b
                a.h.a.a r0 = r0.f1916S
                if (r0 == 0) goto L_0x000e
                boolean r1 = r0 instanceof androidx.appcompat.widget.View$OnClickListenerC0625n0
                if (r1 == 0) goto L_0x000e
                r1 = 0
                r0.mo1930b(r1)
            L_0x000e:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    class View$OnFocusChangeListenerC0541d implements android.view.View.OnFocusChangeListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1956b;

        View$OnFocusChangeListenerC0541d(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1956b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r2, boolean r3) {
                r1 = this;
                androidx.appcompat.widget.SearchView r2 = r1.f1956b
                android.view.View$OnFocusChangeListener r0 = r2.f1911N
                if (r0 == 0) goto L_0x0009
                r0.onFocusChange(r2, r3)
            L_0x0009:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    class View$OnLayoutChangeListenerC0542e implements android.view.View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1957a;

        View$OnLayoutChangeListenerC0542e(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1957a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                r0 = this;
                androidx.appcompat.widget.SearchView r1 = r0.f1957a
                r1.m2224d()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0543f implements android.view.View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1958b;

        View$OnClickListenerC0543f(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1958b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.widget.SearchView r0 = r2.f1958b
                android.widget.ImageView r1 = r0.f1942u
                if (r3 != r1) goto L_0x000a
                r0.m2218h()
                goto L_0x0029
            L_0x000a:
                android.widget.ImageView r1 = r0.f1944w
                if (r3 != r1) goto L_0x0012
                r0.m2219g()
                goto L_0x0029
            L_0x0012:
                android.widget.ImageView r1 = r0.f1943v
                if (r3 != r1) goto L_0x001a
                r0.m2217i()
                goto L_0x0029
            L_0x001a:
                android.widget.ImageView r1 = r0.f1945x
                if (r3 != r1) goto L_0x0022
                r0.m2215k()
                goto L_0x0029
            L_0x0022:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.f1937q
                if (r3 != r1) goto L_0x0029
                r0.m2222e()
            L_0x0029:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    class View$OnKeyListenerC0544g implements android.view.View.OnKeyListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1959b;

        View$OnKeyListenerC0544g(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1959b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(android.view.View r4, int r5, android.view.KeyEvent r6) {
                r3 = this;
                androidx.appcompat.widget.SearchView r0 = r3.f1959b
                android.app.SearchableInfo r1 = r0.f1927g0
                r2 = 0
                if (r1 != 0) goto L_0x0008
                return r2
            L_0x0008:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f1937q
                boolean r0 = r0.isPopupShowing()
                if (r0 == 0) goto L_0x0022
                androidx.appcompat.widget.SearchView r0 = r3.f1959b
                androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f1937q
                int r0 = r0.getListSelection()
                r1 = -1
                if (r0 == r1) goto L_0x0022
                androidx.appcompat.widget.SearchView r0 = r3.f1959b
                boolean r4 = r0.m2238a(r4, r5, r6)
                return r4
            L_0x0022:
                androidx.appcompat.widget.SearchView r0 = r3.f1959b
                androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f1937q
                boolean r0 = r0.m2205a()
                if (r0 != 0) goto L_0x0051
                boolean r0 = r6.hasNoModifiers()
                if (r0 == 0) goto L_0x0051
                int r6 = r6.getAction()
                r0 = 1
                if (r6 != r0) goto L_0x0051
                r6 = 66
                if (r5 != r6) goto L_0x0051
                r4.cancelLongPress()
                androidx.appcompat.widget.SearchView r4 = r3.f1959b
                r5 = 0
                androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r4.f1937q
                android.text.Editable r6 = r6.getText()
                java.lang.String r6 = r6.toString()
                r4.m2243a(r2, r5, r6)
                return r0
            L_0x0051:
                return r2
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    class C0545h implements android.widget.TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1960a;

        C0545h(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1960a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
                r0 = this;
                androidx.appcompat.widget.SearchView r1 = r0.f1960a
                r1.m2217i()
                r1 = 1
                return r1
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    class C0546i implements android.widget.AdapterView.OnItemClickListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1961b;

        C0546i(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1961b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                androidx.appcompat.widget.SearchView r1 = r0.f1961b
                r2 = 0
                r4 = 0
                r1.m2244a(r3, r2, r4)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    class C0547j implements android.widget.AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.SearchView f1962b;

        C0547j(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1962b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                androidx.appcompat.widget.SearchView r1 = r0.f1962b
                r1.m2223d(r3)
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    private static class C0548k {

        /* renamed from: a */
        private java.lang.reflect.Method f1963a;

        /* renamed from: b */
        private java.lang.reflect.Method f1964b;

        /* renamed from: c */
        private java.lang.reflect.Method f1965c;

        C0548k() {
                r6 = this;
                r6.<init>()
                r0 = 0
                r1 = 1
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doBeforeTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: NoSuchMethodException -> 0x0016
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: NoSuchMethodException -> 0x0016
                r6.f1963a = r2     // Catch: NoSuchMethodException -> 0x0016
                java.lang.reflect.Method r2 = r6.f1963a     // Catch: NoSuchMethodException -> 0x0016
                r2.setAccessible(r1)     // Catch: NoSuchMethodException -> 0x0016
            L_0x0016:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doAfterTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: NoSuchMethodException -> 0x0027
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: NoSuchMethodException -> 0x0027
                r6.f1964b = r2     // Catch: NoSuchMethodException -> 0x0027
                java.lang.reflect.Method r2 = r6.f1964b     // Catch: NoSuchMethodException -> 0x0027
                r2.setAccessible(r1)     // Catch: NoSuchMethodException -> 0x0027
            L_0x0027:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "ensureImeVisible"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: NoSuchMethodException -> 0x003c
                java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: NoSuchMethodException -> 0x003c
                r4[r0] = r5     // Catch: NoSuchMethodException -> 0x003c
                java.lang.reflect.Method r0 = r2.getMethod(r3, r4)     // Catch: NoSuchMethodException -> 0x003c
                r6.f1965c = r0     // Catch: NoSuchMethodException -> 0x003c
                java.lang.reflect.Method r0 = r6.f1965c     // Catch: NoSuchMethodException -> 0x003c
                r0.setAccessible(r1)     // Catch: NoSuchMethodException -> 0x003c
            L_0x003c:
                return
        }

        /* renamed from: a */
        void m2203a(android.widget.AutoCompleteTextView r3) {
                r2 = this;
                java.lang.reflect.Method r0 = r2.f1964b
                if (r0 == 0) goto L_0x000a
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: Exception -> 0x000a
                r0.invoke(r3, r1)     // Catch: Exception -> 0x000a
            L_0x000a:
                return
        }

        /* renamed from: a */
        void m2202a(android.widget.AutoCompleteTextView r4, boolean r5) {
                r3 = this;
                java.lang.reflect.Method r0 = r3.f1965c
                if (r0 == 0) goto L_0x0011
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: Exception -> 0x0011
                r2 = 0
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: Exception -> 0x0011
                r1[r2] = r5     // Catch: Exception -> 0x0011
                r0.invoke(r4, r1)     // Catch: Exception -> 0x0011
            L_0x0011:
                return
        }

        /* renamed from: b */
        void m2201b(android.widget.AutoCompleteTextView r3) {
                r2 = this;
                java.lang.reflect.Method r0 = r2.f1963a
                if (r0 == 0) goto L_0x000a
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: Exception -> 0x000a
                r0.invoke(r3, r1)     // Catch: Exception -> 0x000a
            L_0x000a:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public interface AbstractC0549l {
        /* renamed from: a */
        boolean m2200a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public interface AbstractC0550m {
        /* renamed from: a */
        boolean m2199a(java.lang.String r1);

        /* renamed from: b */
        boolean m2198b(java.lang.String r1);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public interface AbstractC0551n {
        /* renamed from: a */
        boolean m2197a(int r1);

        /* renamed from: b */
        boolean m2196b(int r1);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    static class C0552o extends p000a.p033i.p034a.AbstractC0237a {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.SearchView.C0552o> CREATOR = null;

        /* renamed from: d */
        boolean f1966d;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        /* loaded from: classes.dex */
        static class C0553a implements android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.SearchView.C0552o> {
            C0553a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.SearchView.C0552o createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.appcompat.widget.SearchView$o r0 = new androidx.appcompat.widget.SearchView$o
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.appcompat.widget.SearchView.C0552o createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.appcompat.widget.SearchView$o r0 = new androidx.appcompat.widget.SearchView$o
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.appcompat.widget.SearchView$o r1 = r0.createFromParcel(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ androidx.appcompat.widget.SearchView.C0552o createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    androidx.appcompat.widget.SearchView$o r1 = r0.createFromParcel(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.SearchView.C0552o[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.SearchView$o[] r1 = new androidx.appcompat.widget.SearchView.C0552o[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.SearchView$o[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.SearchView$o$a r0 = new androidx.appcompat.widget.SearchView$o$a
                r0.<init>()
                androidx.appcompat.widget.SearchView.C0552o.CREATOR = r0
                return
        }

        public C0552o(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r2 = 0
                java.lang.Object r1 = r1.readValue(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r0.f1966d = r1
                return
        }

        C0552o(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SearchView.SavedState{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " isIconified="
                r0.append(r1)
                boolean r1 = r2.f1966d
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.f1966d
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r1.writeValue(r2)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: classes.dex */
    private static class C0554p extends android.view.TouchDelegate {

        /* renamed from: a */
        private final android.view.View f1967a;

        /* renamed from: b */
        private final android.graphics.Rect f1968b;

        /* renamed from: c */
        private final android.graphics.Rect f1969c;

        /* renamed from: d */
        private final android.graphics.Rect f1970d;

        /* renamed from: e */
        private final int f1971e;

        /* renamed from: f */
        private boolean f1972f;

        public C0554p(android.graphics.Rect r2, android.graphics.Rect r3, android.view.View r4) {
                r1 = this;
                r1.<init>(r2, r4)
                android.content.Context r0 = r4.getContext()
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                int r0 = r0.getScaledTouchSlop()
                r1.f1971e = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f1968b = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f1970d = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f1969c = r0
                r1.m2195a(r2, r3)
                r1.f1967a = r4
                return
        }

        /* renamed from: a */
        public void m2195a(android.graphics.Rect r3, android.graphics.Rect r4) {
                r2 = this;
                android.graphics.Rect r0 = r2.f1968b
                r0.set(r3)
                android.graphics.Rect r0 = r2.f1970d
                r0.set(r3)
                android.graphics.Rect r3 = r2.f1970d
                int r0 = r2.f1971e
                int r1 = -r0
                int r0 = -r0
                r3.inset(r1, r0)
                android.graphics.Rect r3 = r2.f1969c
                r3.set(r4)
                return
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(android.view.MotionEvent r8) {
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x002e
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003a
            L_0x001b:
                boolean r2 = r7.f1972f
                r7.f1972f = r5
                goto L_0x003b
            L_0x0020:
                boolean r2 = r7.f1972f
                if (r2 == 0) goto L_0x003b
                android.graphics.Rect r6 = r7.f1970d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x003b
                r4 = 0
                goto L_0x003b
            L_0x002e:
                android.graphics.Rect r2 = r7.f1968b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003a
                r7.f1972f = r4
                r2 = 1
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r2 == 0) goto L_0x006a
                if (r4 == 0) goto L_0x0057
                android.graphics.Rect r2 = r7.f1969c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0057
                android.view.View r0 = r7.f1967a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1967a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0060
            L_0x0057:
                android.graphics.Rect r2 = r7.f1969c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0060:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f1967a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006a:
                return r5
        }
    }

    static {
            androidx.appcompat.widget.SearchView$k r0 = new androidx.appcompat.widget.SearchView$k
            r0.<init>()
            androidx.appcompat.widget.SearchView.f1897r0 = r0
            return
    }

    public SearchView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.searchViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f1898A = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f1899B = r0
            r0 = 2
            int[] r1 = new int[r0]
            r3.f1900C = r1
            int[] r0 = new int[r0]
            r3.f1901D = r0
            androidx.appcompat.widget.SearchView$b r0 = new androidx.appcompat.widget.SearchView$b
            r0.<init>(r3)
            r3.f1929i0 = r0
            androidx.appcompat.widget.SearchView$c r0 = new androidx.appcompat.widget.SearchView$c
            r0.<init>(r3)
            r3.f1930j0 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.f1931k0 = r0
            androidx.appcompat.widget.SearchView$f r0 = new androidx.appcompat.widget.SearchView$f
            r0.<init>(r3)
            r3.f1932l0 = r0
            androidx.appcompat.widget.SearchView$g r0 = new androidx.appcompat.widget.SearchView$g
            r0.<init>(r3)
            r3.f1933m0 = r0
            androidx.appcompat.widget.SearchView$h r0 = new androidx.appcompat.widget.SearchView$h
            r0.<init>(r3)
            r3.f1934n0 = r0
            androidx.appcompat.widget.SearchView$i r0 = new androidx.appcompat.widget.SearchView$i
            r0.<init>(r3)
            r3.f1935o0 = r0
            androidx.appcompat.widget.SearchView$j r0 = new androidx.appcompat.widget.SearchView$j
            r0.<init>(r3)
            r3.f1936p0 = r0
            androidx.appcompat.widget.SearchView$a r0 = new androidx.appcompat.widget.SearchView$a
            r0.<init>(r3)
            r3.f1938q0 = r0
            int[] r0 = p000a.p001a.C0009j.SearchView
            r1 = 0
            androidx.appcompat.widget.t0 r5 = androidx.appcompat.widget.C0638t0.m1900a(r4, r5, r0, r6, r1)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r6 = p000a.p001a.C0009j.SearchView_layout
            int r0 = p000a.p001a.C0006g.abc_search_view
            int r6 = r5.m1888g(r6, r0)
            r0 = 1
            r4.inflate(r6, r3, r0)
            int r4 = p000a.p001a.C0005f.search_src_text
            android.view.View r4 = r3.findViewById(r4)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r4
            r3.f1937q = r4
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1937q
            r4.setSearchView(r3)
            int r4 = p000a.p001a.C0005f.search_edit_frame
            android.view.View r4 = r3.findViewById(r4)
            r3.f1939r = r4
            int r4 = p000a.p001a.C0005f.search_plate
            android.view.View r4 = r3.findViewById(r4)
            r3.f1940s = r4
            int r4 = p000a.p001a.C0005f.submit_area
            android.view.View r4 = r3.findViewById(r4)
            r3.f1941t = r4
            int r4 = p000a.p001a.C0005f.search_button
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f1942u = r4
            int r4 = p000a.p001a.C0005f.search_go_btn
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f1943v = r4
            int r4 = p000a.p001a.C0005f.search_close_btn
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f1944w = r4
            int r4 = p000a.p001a.C0005f.search_voice_btn
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f1945x = r4
            int r4 = p000a.p001a.C0005f.search_mag_icon
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f1902E = r4
            android.view.View r4 = r3.f1940s
            int r6 = p000a.p001a.C0009j.SearchView_queryBackground
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            p000a.p018g.p029l.C0216r.m3434a(r4, r6)
            android.view.View r4 = r3.f1941t
            int r6 = p000a.p001a.C0009j.SearchView_submitBackground
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            p000a.p018g.p029l.C0216r.m3434a(r4, r6)
            android.widget.ImageView r4 = r3.f1942u
            int r6 = p000a.p001a.C0009j.SearchView_searchIcon
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r3.f1943v
            int r6 = p000a.p001a.C0009j.SearchView_goIcon
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r3.f1944w
            int r6 = p000a.p001a.C0009j.SearchView_closeIcon
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r3.f1945x
            int r6 = p000a.p001a.C0009j.SearchView_voiceIcon
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r3.f1902E
            int r6 = p000a.p001a.C0009j.SearchView_searchIcon
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            r4.setImageDrawable(r6)
            int r4 = p000a.p001a.C0009j.SearchView_searchHintIcon
            android.graphics.drawable.Drawable r4 = r5.m1899b(r4)
            r3.f1903F = r4
            android.widget.ImageView r4 = r3.f1942u
            android.content.res.Resources r6 = r3.getResources()
            int r2 = p000a.p001a.C0007h.abc_searchview_description_search
            java.lang.String r6 = r6.getString(r2)
            androidx.appcompat.widget.C0644v0.m1841a(r4, r6)
            int r4 = p000a.p001a.C0009j.SearchView_suggestionRowLayout
            int r6 = p000a.p001a.C0006g.abc_search_dropdown_item_icons_2line
            int r4 = r5.m1888g(r4, r6)
            r3.f1904G = r4
            int r4 = p000a.p001a.C0009j.SearchView_commitIcon
            int r4 = r5.m1888g(r4, r1)
            r3.f1905H = r4
            android.widget.ImageView r4 = r3.f1942u
            android.view.View$OnClickListener r6 = r3.f1932l0
            r4.setOnClickListener(r6)
            android.widget.ImageView r4 = r3.f1944w
            android.view.View$OnClickListener r6 = r3.f1932l0
            r4.setOnClickListener(r6)
            android.widget.ImageView r4 = r3.f1943v
            android.view.View$OnClickListener r6 = r3.f1932l0
            r4.setOnClickListener(r6)
            android.widget.ImageView r4 = r3.f1945x
            android.view.View$OnClickListener r6 = r3.f1932l0
            r4.setOnClickListener(r6)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1937q
            android.view.View$OnClickListener r6 = r3.f1932l0
            r4.setOnClickListener(r6)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1937q
            android.text.TextWatcher r6 = r3.f1938q0
            r4.addTextChangedListener(r6)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1937q
            android.widget.TextView$OnEditorActionListener r6 = r3.f1934n0
            r4.setOnEditorActionListener(r6)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1937q
            android.widget.AdapterView$OnItemClickListener r6 = r3.f1935o0
            r4.setOnItemClickListener(r6)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1937q
            android.widget.AdapterView$OnItemSelectedListener r6 = r3.f1936p0
            r4.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1937q
            android.view.View$OnKeyListener r6 = r3.f1933m0
            r4.setOnKeyListener(r6)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1937q
            androidx.appcompat.widget.SearchView$d r6 = new androidx.appcompat.widget.SearchView$d
            r6.<init>(r3)
            r4.setOnFocusChangeListener(r6)
            int r4 = p000a.p001a.C0009j.SearchView_iconifiedByDefault
            boolean r4 = r5.m1903a(r4, r0)
            r3.setIconifiedByDefault(r4)
            int r4 = p000a.p001a.C0009j.SearchView_android_maxWidth
            r6 = -1
            int r4 = r5.m1896c(r4, r6)
            if (r4 == r6) goto L_0x01a4
            r3.setMaxWidth(r4)
        L_0x01a4:
            int r4 = p000a.p001a.C0009j.SearchView_defaultQueryHint
            java.lang.CharSequence r4 = r5.m1893e(r4)
            r3.f1908K = r4
            int r4 = p000a.p001a.C0009j.SearchView_queryHint
            java.lang.CharSequence r4 = r5.m1893e(r4)
            r3.f1918U = r4
            int r4 = p000a.p001a.C0009j.SearchView_android_imeOptions
            int r4 = r5.m1894d(r4, r6)
            if (r4 == r6) goto L_0x01bf
            r3.setImeOptions(r4)
        L_0x01bf:
            int r4 = p000a.p001a.C0009j.SearchView_android_inputType
            int r4 = r5.m1894d(r4, r6)
            if (r4 == r6) goto L_0x01ca
            r3.setInputType(r4)
        L_0x01ca:
            int r4 = p000a.p001a.C0009j.SearchView_android_focusable
            boolean r4 = r5.m1903a(r4, r0)
            r3.setFocusable(r4)
            r5.m1908a()
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.speech.action.WEB_SEARCH"
            r4.<init>(r5)
            r3.f1906I = r4
            android.content.Intent r4 = r3.f1906I
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r4.addFlags(r5)
            android.content.Intent r4 = r3.f1906I
            java.lang.String r6 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r0 = "web_search"
            r4.putExtra(r6, r0)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r6 = "android.speech.action.RECOGNIZE_SPEECH"
            r4.<init>(r6)
            r3.f1907J = r4
            android.content.Intent r4 = r3.f1907J
            r4.addFlags(r5)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1937q
            int r4 = r4.getDropDownAnchor()
            android.view.View r4 = r3.findViewById(r4)
            r3.f1946y = r4
            android.view.View r4 = r3.f1946y
            if (r4 == 0) goto L_0x0215
            androidx.appcompat.widget.SearchView$e r5 = new androidx.appcompat.widget.SearchView$e
            r5.<init>(r3)
            r4.addOnLayoutChangeListener(r5)
        L_0x0215:
            boolean r4 = r3.f1914Q
            r3.m2228b(r4)
            r3.m2208r()
            return
    }

    /* renamed from: a */
    private android.content.Intent m2240a(android.content.Intent r10, android.app.SearchableInfo r11) {
            r9 = this;
            android.content.ComponentName r0 = r11.getSearchActivity()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SEARCH"
            r1.<init>(r2)
            r1.setComponent(r0)
            android.content.Context r2 = r9.getContext()
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r3, r1, r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = r9.f1928h0
            if (r3 == 0) goto L_0x0027
            java.lang.String r4 = "app_data"
            r2.putParcelable(r4, r3)
        L_0x0027:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r10)
            r10 = 1
            android.content.res.Resources r4 = r9.getResources()
            int r5 = r11.getVoiceLanguageModeId()
            if (r5 == 0) goto L_0x0040
            int r5 = r11.getVoiceLanguageModeId()
            java.lang.String r5 = r4.getString(r5)
            goto L_0x0042
        L_0x0040:
            java.lang.String r5 = "free_form"
        L_0x0042:
            int r6 = r11.getVoicePromptTextId()
            r7 = 0
            if (r6 == 0) goto L_0x0052
            int r6 = r11.getVoicePromptTextId()
            java.lang.String r6 = r4.getString(r6)
            goto L_0x0053
        L_0x0052:
            r6 = r7
        L_0x0053:
            int r8 = r11.getVoiceLanguageId()
            if (r8 == 0) goto L_0x0062
            int r8 = r11.getVoiceLanguageId()
            java.lang.String r4 = r4.getString(r8)
            goto L_0x0063
        L_0x0062:
            r4 = r7
        L_0x0063:
            int r8 = r11.getVoiceMaxResults()
            if (r8 == 0) goto L_0x006d
            int r10 = r11.getVoiceMaxResults()
        L_0x006d:
            java.lang.String r11 = "android.speech.extra.LANGUAGE_MODEL"
            r3.putExtra(r11, r5)
            java.lang.String r11 = "android.speech.extra.PROMPT"
            r3.putExtra(r11, r6)
            java.lang.String r11 = "android.speech.extra.LANGUAGE"
            r3.putExtra(r11, r4)
            java.lang.String r11 = "android.speech.extra.MAX_RESULTS"
            r3.putExtra(r11, r10)
            if (r0 != 0) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            java.lang.String r7 = r0.flattenToShortString()
        L_0x0088:
            java.lang.String r10 = "calling_package"
            r3.putExtra(r10, r7)
            java.lang.String r10 = "android.speech.extra.RESULTS_PENDINGINTENT"
            r3.putExtra(r10, r1)
            java.lang.String r10 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
            r3.putExtra(r10, r2)
            return r3
    }

    /* renamed from: a */
    private android.content.Intent m2239a(android.database.Cursor r9, int r10, java.lang.String r11) {
            r8 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = androidx.appcompat.widget.View$OnClickListenerC0625n0.m1940a(r9, r1)     // Catch: RuntimeException -> 0x0061
            if (r1 != 0) goto L_0x000f
            android.app.SearchableInfo r1 = r8.f1927g0     // Catch: RuntimeException -> 0x0061
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch: RuntimeException -> 0x0061
        L_0x000f:
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0013:
            r2 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = androidx.appcompat.widget.View$OnClickListenerC0625n0.m1940a(r9, r1)     // Catch: RuntimeException -> 0x0061
            if (r1 != 0) goto L_0x0022
            android.app.SearchableInfo r1 = r8.f1927g0     // Catch: RuntimeException -> 0x0061
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch: RuntimeException -> 0x0061
        L_0x0022:
            if (r1 == 0) goto L_0x0044
            java.lang.String r3 = "suggest_intent_data_id"
            java.lang.String r3 = androidx.appcompat.widget.View$OnClickListenerC0625n0.m1940a(r9, r3)     // Catch: RuntimeException -> 0x0061
            if (r3 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: RuntimeException -> 0x0061
            r4.<init>()     // Catch: RuntimeException -> 0x0061
            r4.append(r1)     // Catch: RuntimeException -> 0x0061
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch: RuntimeException -> 0x0061
            java.lang.String r1 = android.net.Uri.encode(r3)     // Catch: RuntimeException -> 0x0061
            r4.append(r1)     // Catch: RuntimeException -> 0x0061
            java.lang.String r1 = r4.toString()     // Catch: RuntimeException -> 0x0061
        L_0x0044:
            if (r1 != 0) goto L_0x0048
            r3 = r0
            goto L_0x004d
        L_0x0048:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: RuntimeException -> 0x0061
            r3 = r1
        L_0x004d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r5 = androidx.appcompat.widget.View$OnClickListenerC0625n0.m1940a(r9, r1)     // Catch: RuntimeException -> 0x0061
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r4 = androidx.appcompat.widget.View$OnClickListenerC0625n0.m1940a(r9, r1)     // Catch: RuntimeException -> 0x0061
            r1 = r8
            r6 = r10
            r7 = r11
            android.content.Intent r9 = r1.m2234a(r2, r3, r4, r5, r6, r7)     // Catch: RuntimeException -> 0x0061
            return r9
        L_0x0061:
            r10 = move-exception
            int r9 = r9.getPosition()     // Catch: RuntimeException -> 0x0067
            goto L_0x0068
        L_0x0067:
            r9 = -1
        L_0x0068:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Search suggestions cursor at row "
            r11.append(r1)
            r11.append(r9)
            java.lang.String r9 = " returned exception."
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.lang.String r11 = "SearchView"
            android.util.Log.w(r11, r9, r10)
            return r0
    }

    /* renamed from: a */
    private android.content.Intent m2234a(java.lang.String r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)
            if (r3 == 0) goto L_0x000f
            r0.setData(r3)
        L_0x000f:
            java.lang.CharSequence r2 = r1.f1924d0
            java.lang.String r3 = "user_query"
            r0.putExtra(r3, r2)
            if (r5 == 0) goto L_0x001d
            java.lang.String r2 = "query"
            r0.putExtra(r2, r5)
        L_0x001d:
            if (r4 == 0) goto L_0x0024
            java.lang.String r2 = "intent_extra_data_key"
            r0.putExtra(r2, r4)
        L_0x0024:
            android.os.Bundle r2 = r1.f1928h0
            if (r2 == 0) goto L_0x002d
            java.lang.String r3 = "app_data"
            r0.putExtra(r3, r2)
        L_0x002d:
            if (r6 == 0) goto L_0x0039
            java.lang.String r2 = "action_key"
            r0.putExtra(r2, r6)
            java.lang.String r2 = "action_msg"
            r0.putExtra(r2, r7)
        L_0x0039:
            android.app.SearchableInfo r2 = r1.f1927g0
            android.content.ComponentName r2 = r2.getSearchActivity()
            r0.setComponent(r2)
            return r0
    }

    /* renamed from: a */
    private void m2241a(android.content.Intent r4) {
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r3.getContext()     // Catch: RuntimeException -> 0x000b
            r0.startActivity(r4)     // Catch: RuntimeException -> 0x000b
            goto L_0x0022
        L_0x000b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed launch activity: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "SearchView"
            android.util.Log.e(r1, r4, r0)
        L_0x0022:
            return
    }

    /* renamed from: a */
    private void m2237a(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            int[] r0 = r4.f1900C
            r5.getLocationInWindow(r0)
            int[] r0 = r4.f1901D
            r4.getLocationInWindow(r0)
            int[] r0 = r4.f1900C
            r1 = 1
            r2 = r0[r1]
            int[] r3 = r4.f1901D
            r1 = r3[r1]
            int r2 = r2 - r1
            r1 = 0
            r0 = r0[r1]
            r1 = r3[r1]
            int r0 = r0 - r1
            int r1 = r5.getWidth()
            int r1 = r1 + r0
            int r5 = r5.getHeight()
            int r5 = r5 + r2
            r6.set(r0, r2, r1, r5)
            return
    }

    /* renamed from: a */
    private void m2233a(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1917T
            if (r0 == 0) goto L_0x0018
            boolean r0 = r1.m2211o()
            if (r0 == 0) goto L_0x0018
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x0018
            if (r2 != 0) goto L_0x0016
            boolean r2 = r1.f1922b0
            if (r2 != 0) goto L_0x0018
        L_0x0016:
            r2 = 0
            goto L_0x001a
        L_0x0018:
            r2 = 8
        L_0x001a:
            android.widget.ImageView r0 = r1.f1943v
            r0.setVisibility(r2)
            return
    }

    /* renamed from: a */
    static boolean m2242a(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r0 = 2
            if (r1 != r0) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            return r1
    }

    /* renamed from: b */
    private android.content.Intent m2230b(android.content.Intent r2, android.app.SearchableInfo r3) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            android.content.ComponentName r2 = r3.getSearchActivity()
            if (r2 != 0) goto L_0x000d
            r2 = 0
            goto L_0x0011
        L_0x000d:
            java.lang.String r2 = r2.flattenToShortString()
        L_0x0011:
            java.lang.String r3 = "calling_package"
            r0.putExtra(r3, r2)
            return r0
    }

    /* renamed from: b */
    private void m2228b(boolean r6) {
            r5 = this;
            r5.f1915R = r6
            r0 = 0
            r1 = 8
            if (r6 == 0) goto L_0x0009
            r2 = 0
            goto L_0x000b
        L_0x0009:
            r2 = 8
        L_0x000b:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r5.f1937q
            android.text.Editable r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ 1
            android.widget.ImageView r4 = r5.f1942u
            r4.setVisibility(r2)
            r5.m2233a(r3)
            android.view.View r2 = r5.f1939r
            if (r6 == 0) goto L_0x0026
            r6 = 8
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            r2.setVisibility(r6)
            android.widget.ImageView r6 = r5.f1902E
            android.graphics.drawable.Drawable r6 = r6.getDrawable()
            if (r6 == 0) goto L_0x0036
            boolean r6 = r5.f1914Q
            if (r6 == 0) goto L_0x0038
        L_0x0036:
            r0 = 8
        L_0x0038:
            android.widget.ImageView r6 = r5.f1902E
            r6.setVisibility(r0)
            r5.m2209q()
            r6 = r3 ^ 1
            r5.m2225c(r6)
            r5.m2206t()
            return
    }

    /* renamed from: b */
    private boolean m2231b(int r2, int r3, java.lang.String r4) {
            r1 = this;
            a.h.a.a r0 = r1.f1916S
            android.database.Cursor r0 = r0.mo3349a()
            if (r0 == 0) goto L_0x0017
            boolean r2 = r0.moveToPosition(r2)
            if (r2 == 0) goto L_0x0017
            android.content.Intent r2 = r1.m2239a(r0, r3, r4)
            r1.m2241a(r2)
            r2 = 1
            return r2
        L_0x0017:
            r2 = 0
            return r2
    }

    /* renamed from: c */
    private java.lang.CharSequence m2226c(java.lang.CharSequence r6) {
            r5 = this;
            boolean r0 = r5.f1914Q
            if (r0 == 0) goto L_0x0037
            android.graphics.drawable.Drawable r0 = r5.f1903F
            if (r0 != 0) goto L_0x0009
            goto L_0x0037
        L_0x0009:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r5.f1937q
            float r0 = r0.getTextSize()
            double r0 = (double) r0
            r2 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r2
            int r0 = (int) r0
            android.graphics.drawable.Drawable r1 = r5.f1903F
            r2 = 0
            r1.setBounds(r2, r2, r0, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.String r1 = "   "
            r0.<init>(r1)
            android.text.style.ImageSpan r1 = new android.text.style.ImageSpan
            android.graphics.drawable.Drawable r2 = r5.f1903F
            r1.<init>(r2)
            r2 = 1
            r3 = 2
            r4 = 33
            r0.setSpan(r1, r2, r3, r4)
            r0.append(r6)
            return r0
        L_0x0037:
            return r6
    }

    /* renamed from: c */
    private void m2225c(boolean r3) {
            r2 = this;
            boolean r0 = r2.f1922b0
            r1 = 8
            if (r0 == 0) goto L_0x0015
            boolean r0 = r2.m2220f()
            if (r0 != 0) goto L_0x0015
            if (r3 == 0) goto L_0x0015
            r3 = 0
            android.widget.ImageView r0 = r2.f1943v
            r0.setVisibility(r1)
            goto L_0x0017
        L_0x0015:
            r3 = 8
        L_0x0017:
            android.widget.ImageView r0 = r2.f1945x
            r0.setVisibility(r3)
            return
    }

    /* renamed from: e */
    private void m2221e(int r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            android.text.Editable r0 = r0.getText()
            a.h.a.a r1 = r2.f1916S
            android.database.Cursor r1 = r1.mo3349a()
            if (r1 != 0) goto L_0x000f
            return
        L_0x000f:
            boolean r3 = r1.moveToPosition(r3)
            if (r3 == 0) goto L_0x0021
            a.h.a.a r3 = r2.f1916S
            java.lang.CharSequence r3 = r3.mo1942a(r1)
            if (r3 == 0) goto L_0x0021
            r2.setQuery(r3)
            goto L_0x0024
        L_0x0021:
            r2.setQuery(r0)
        L_0x0024:
            return
    }

    private int getPreferredHeight() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p000a.p001a.C0003d.abc_search_view_preferred_height
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private int getPreferredWidth() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p000a.p001a.C0003d.abc_search_view_preferred_width
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    /* renamed from: m */
    private void m2213m() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1937q
            r0.dismissDropDown()
            return
    }

    /* renamed from: n */
    private boolean m2212n() {
            r4 = this;
            android.app.SearchableInfo r0 = r4.f1927g0
            r1 = 0
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.getVoiceSearchEnabled()
            if (r0 == 0) goto L_0x0034
            r0 = 0
            android.app.SearchableInfo r2 = r4.f1927g0
            boolean r2 = r2.getVoiceSearchLaunchWebSearch()
            if (r2 == 0) goto L_0x0017
            android.content.Intent r0 = r4.f1906I
            goto L_0x0021
        L_0x0017:
            android.app.SearchableInfo r2 = r4.f1927g0
            boolean r2 = r2.getVoiceSearchLaunchRecognizer()
            if (r2 == 0) goto L_0x0021
            android.content.Intent r0 = r4.f1907J
        L_0x0021:
            if (r0 == 0) goto L_0x0034
            android.content.Context r2 = r4.getContext()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r3 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r2.resolveActivity(r0, r3)
            if (r0 == 0) goto L_0x0034
            r1 = 1
        L_0x0034:
            return r1
    }

    /* renamed from: o */
    private boolean m2211o() {
            r1 = this;
            boolean r0 = r1.f1917T
            if (r0 != 0) goto L_0x0008
            boolean r0 = r1.f1922b0
            if (r0 == 0) goto L_0x0010
        L_0x0008:
            boolean r0 = r1.m2220f()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
    }

    /* renamed from: p */
    private void m2210p() {
            r1 = this;
            java.lang.Runnable r0 = r1.f1929i0
            r1.post(r0)
            return
    }

    /* renamed from: q */
    private void m2209q() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.f1937q
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            boolean r3 = r4.f1914Q
            if (r3 == 0) goto L_0x0018
            boolean r3 = r4.f1925e0
            if (r3 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            android.widget.ImageView r3 = r4.f1944w
            if (r1 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r2 = 8
        L_0x0020:
            r3.setVisibility(r2)
            android.widget.ImageView r1 = r4.f1944w
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 == 0) goto L_0x0035
            if (r0 == 0) goto L_0x0030
            int[] r0 = android.view.ViewGroup.ENABLED_STATE_SET
            goto L_0x0032
        L_0x0030:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        L_0x0032:
            r1.setState(r0)
        L_0x0035:
            return
    }

    /* renamed from: r */
    private void m2208r() {
            r2 = this;
            java.lang.CharSequence r0 = r2.getQueryHint()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.f1937q
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = ""
        L_0x000a:
            java.lang.CharSequence r0 = r2.m2226c(r0)
            r1.setHint(r0)
            return
    }

    /* renamed from: s */
    private void m2207s() {
            r5 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r5.f1937q
            android.app.SearchableInfo r1 = r5.f1927g0
            int r1 = r1.getSuggestThreshold()
            r0.setThreshold(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r5.f1937q
            android.app.SearchableInfo r1 = r5.f1927g0
            int r1 = r1.getImeOptions()
            r0.setImeOptions(r1)
            android.app.SearchableInfo r0 = r5.f1927g0
            int r0 = r0.getInputType()
            r1 = r0 & 15
            r2 = 1
            if (r1 != r2) goto L_0x0033
            r1 = -65537(0xfffffffffffeffff, float:NaN)
            r0 = r0 & r1
            android.app.SearchableInfo r1 = r5.f1927g0
            java.lang.String r1 = r1.getSuggestAuthority()
            if (r1 == 0) goto L_0x0033
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 | r1
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r1
        L_0x0033:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r5.f1937q
            r1.setInputType(r0)
            a.h.a.a r0 = r5.f1916S
            if (r0 == 0) goto L_0x0040
            r1 = 0
            r0.mo1930b(r1)
        L_0x0040:
            android.app.SearchableInfo r0 = r5.f1927g0
            java.lang.String r0 = r0.getSuggestAuthority()
            if (r0 == 0) goto L_0x006a
            androidx.appcompat.widget.n0 r0 = new androidx.appcompat.widget.n0
            android.content.Context r1 = r5.getContext()
            android.app.SearchableInfo r3 = r5.f1927g0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r5.f1931k0
            r0.<init>(r1, r5, r3, r4)
            r5.f1916S = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r5.f1937q
            a.h.a.a r1 = r5.f1916S
            r0.setAdapter(r1)
            a.h.a.a r0 = r5.f1916S
            androidx.appcompat.widget.n0 r0 = (androidx.appcompat.widget.View$OnClickListenerC0625n0) r0
            boolean r1 = r5.f1919V
            if (r1 == 0) goto L_0x0067
            r2 = 2
        L_0x0067:
            r0.m1945a(r2)
        L_0x006a:
            return
    }

    private void setQuery(java.lang.CharSequence r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            r0.setText(r3)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x000f
            r3 = 0
            goto L_0x0013
        L_0x000f:
            int r3 = r3.length()
        L_0x0013:
            r0.setSelection(r3)
            return
    }

    /* renamed from: t */
    private void m2206t() {
            r2 = this;
            boolean r0 = r2.m2211o()
            if (r0 == 0) goto L_0x0018
            android.widget.ImageView r0 = r2.f1943v
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0016
            android.widget.ImageView r0 = r2.f1945x
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x001a
        L_0x0018:
            r0 = 8
        L_0x001a:
            android.view.View r1 = r2.f1941t
            r1.setVisibility(r0)
            return
    }

    /* renamed from: a */
    void m2243a(int r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            java.lang.String r1 = "android.intent.action.SEARCH"
            r2 = 0
            r3 = 0
            r0 = r7
            r4 = r10
            r5 = r8
            r6 = r9
            android.content.Intent r8 = r0.m2234a(r1, r2, r3, r4, r5, r6)
            android.content.Context r9 = r7.getContext()
            r9.startActivity(r8)
            return
    }

    /* renamed from: a */
    void m2236a(java.lang.CharSequence r1) {
            r0 = this;
            r0.setQuery(r1)
            return
    }

    /* renamed from: a */
    public void m2235a(java.lang.CharSequence r3, boolean r4) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            r0.setText(r3)
            if (r3 == 0) goto L_0x0012
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            int r1 = r0.length()
            r0.setSelection(r1)
            r2.f1924d0 = r3
        L_0x0012:
            if (r4 == 0) goto L_0x001d
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x001d
            r2.m2217i()
        L_0x001d:
            return
    }

    /* renamed from: a */
    boolean m2244a(int r1, int r2, java.lang.String r3) {
            r0 = this;
            androidx.appcompat.widget.SearchView$n r2 = r0.f1912O
            r3 = 0
            if (r2 == 0) goto L_0x000d
            boolean r2 = r2.m2196b(r1)
            if (r2 != 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            return r3
        L_0x000d:
            r2 = 0
            r0.m2231b(r1, r3, r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.f1937q
            r1.setImeVisibility(r3)
            r0.m2213m()
            r1 = 1
            return r1
    }

    /* renamed from: a */
    boolean m2238a(android.view.View r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            android.app.SearchableInfo r2 = r1.f1927g0
            r0 = 0
            if (r2 != 0) goto L_0x0006
            return r0
        L_0x0006:
            a.h.a.a r2 = r1.f1916S
            if (r2 != 0) goto L_0x000b
            return r0
        L_0x000b:
            int r2 = r4.getAction()
            if (r2 != 0) goto L_0x0068
            boolean r2 = r4.hasNoModifiers()
            if (r2 == 0) goto L_0x0068
            r2 = 66
            if (r3 == r2) goto L_0x005c
            r2 = 84
            if (r3 == r2) goto L_0x005c
            r2 = 61
            if (r3 != r2) goto L_0x0024
            goto L_0x005c
        L_0x0024:
            r2 = 21
            if (r3 == r2) goto L_0x003a
            r4 = 22
            if (r3 != r4) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            r2 = 19
            if (r3 != r2) goto L_0x0068
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f1937q
            int r2 = r2.getListSelection()
            if (r2 != 0) goto L_0x0068
            return r0
        L_0x003a:
            if (r3 != r2) goto L_0x003e
            r2 = 0
            goto L_0x0044
        L_0x003e:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f1937q
            int r2 = r2.length()
        L_0x0044:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r1.f1937q
            r3.setSelection(r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f1937q
            r2.setListSelection(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f1937q
            r2.clearListSelection()
            androidx.appcompat.widget.SearchView$k r2 = androidx.appcompat.widget.SearchView.f1897r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r1.f1937q
            r4 = 1
            r2.m2202a(r3, r4)
            return r4
        L_0x005c:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f1937q
            int r2 = r2.getListSelection()
            r3 = 0
            boolean r2 = r1.m2244a(r2, r0, r3)
            return r2
        L_0x0068:
            return r0
    }

    @Override // p000a.p001a.p006m.AbstractC0031c
    /* renamed from: b */
    public void mo2232b() {
            r3 = this;
            boolean r0 = r3.f1925e0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r3.f1925e0 = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1937q
            int r0 = r0.getImeOptions()
            r3.f1926f0 = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1937q
            int r1 = r3.f1926f0
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r2
            r0.setImeOptions(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1937q
            java.lang.String r1 = ""
            r0.setText(r1)
            r0 = 0
            r3.setIconified(r0)
            return
    }

    /* renamed from: b */
    void m2229b(java.lang.CharSequence r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            android.text.Editable r0 = r0.getText()
            r2.f1924d0 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r2.m2233a(r0)
            r0 = r0 ^ 1
            r2.m2225c(r0)
            r2.m2209q()
            r2.m2206t()
            androidx.appcompat.widget.SearchView$m r0 = r2.f1909L
            if (r0 == 0) goto L_0x0031
            java.lang.CharSequence r0 = r2.f1923c0
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L_0x0031
            androidx.appcompat.widget.SearchView$m r0 = r2.f1909L
            java.lang.String r1 = r3.toString()
            r0.m2198b(r1)
        L_0x0031:
            java.lang.String r3 = r3.toString()
            r2.f1923c0 = r3
            return
    }

    @Override // p000a.p001a.p006m.AbstractC0031c
    /* renamed from: c */
    public void mo2227c() {
            r3 = this;
            r0 = 0
            java.lang.String r1 = ""
            r3.m2235a(r1, r0)
            r3.clearFocus()
            r1 = 1
            r3.m2228b(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r3.f1937q
            int r2 = r3.f1926f0
            r1.setImeOptions(r2)
            r3.f1925e0 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
            r2 = this;
            r0 = 1
            r2.f1920W = r0
            super.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            r0.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            r1 = 0
            r0.setImeVisibility(r1)
            r2.f1920W = r1
            return
    }

    /* renamed from: d */
    void m2224d() {
            r6 = this;
            android.view.View r0 = r6.f1946y
            int r0 = r0.getWidth()
            r1 = 1
            if (r0 <= r1) goto L_0x005d
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.view.View r1 = r6.f1940s
            int r1 = r1.getPaddingLeft()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r3 = androidx.appcompat.widget.C0661z0.m1764a(r6)
            boolean r4 = r6.f1914Q
            if (r4 == 0) goto L_0x0032
            int r4 = p000a.p001a.C0003d.abc_dropdownitem_icon_width
            int r4 = r0.getDimensionPixelSize(r4)
            int r5 = p000a.p001a.C0003d.abc_dropdownitem_text_padding_left
            int r0 = r0.getDimensionPixelSize(r5)
            int r4 = r4 + r0
            goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r6.f1937q
            android.graphics.drawable.Drawable r0 = r0.getDropDownBackground()
            r0.getPadding(r2)
            int r0 = r2.left
            if (r3 == 0) goto L_0x0042
            int r0 = -r0
            goto L_0x0045
        L_0x0042:
            int r0 = r0 + r4
            int r0 = r1 - r0
        L_0x0045:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1937q
            r3.setDropDownHorizontalOffset(r0)
            android.view.View r0 = r6.f1946y
            int r0 = r0.getWidth()
            int r3 = r2.left
            int r0 = r0 + r3
            int r2 = r2.right
            int r0 = r0 + r2
            int r0 = r0 + r4
            int r0 = r0 - r1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r6.f1937q
            r1.setDropDownWidth(r0)
        L_0x005d:
            return
    }

    /* renamed from: d */
    boolean m2223d(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$n r0 = r1.f1912O
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.m2197a(r2)
            if (r0 != 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            return r2
        L_0x000d:
            r1.m2221e(r2)
            r2 = 1
            return r2
    }

    /* renamed from: e */
    void m2222e() {
            r2 = this;
            androidx.appcompat.widget.SearchView$k r0 = androidx.appcompat.widget.SearchView.f1897r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.f1937q
            r0.m2201b(r1)
            androidx.appcompat.widget.SearchView$k r0 = androidx.appcompat.widget.SearchView.f1897r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.f1937q
            r0.m2203a(r1)
            return
    }

    /* renamed from: f */
    public boolean m2220f() {
            r1 = this;
            boolean r0 = r1.f1915R
            return r0
    }

    /* renamed from: g */
    void m2219g() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1937q
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0022
            boolean r0 = r3.f1914Q
            if (r0 == 0) goto L_0x0033
            androidx.appcompat.widget.SearchView$l r0 = r3.f1910M
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.m2200a()
            if (r0 != 0) goto L_0x0033
        L_0x001b:
            r3.clearFocus()
            r3.m2228b(r1)
            goto L_0x0033
        L_0x0022:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1937q
            java.lang.String r2 = ""
            r0.setText(r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1937q
            r0.requestFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1937q
            r0.setImeVisibility(r1)
        L_0x0033:
            return
    }

    public int getImeOptions() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1937q
            int r0 = r0.getImeOptions()
            return r0
    }

    public int getInputType() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1937q
            int r0 = r0.getInputType()
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.f1921a0
            return r0
    }

    public java.lang.CharSequence getQuery() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1937q
            android.text.Editable r0 = r0.getText()
            return r0
    }

    public java.lang.CharSequence getQueryHint() {
            r2 = this;
            java.lang.CharSequence r0 = r2.f1918U
            if (r0 == 0) goto L_0x0005
            goto L_0x0020
        L_0x0005:
            android.app.SearchableInfo r0 = r2.f1927g0
            if (r0 == 0) goto L_0x001e
            int r0 = r0.getHintId()
            if (r0 == 0) goto L_0x001e
            android.content.Context r0 = r2.getContext()
            android.app.SearchableInfo r1 = r2.f1927g0
            int r1 = r1.getHintId()
            java.lang.CharSequence r0 = r0.getText(r1)
            goto L_0x0020
        L_0x001e:
            java.lang.CharSequence r0 = r2.f1908K
        L_0x0020:
            return r0
    }

    int getSuggestionCommitIconResId() {
            r1 = this;
            int r0 = r1.f1905H
            return r0
    }

    int getSuggestionRowLayout() {
            r1 = this;
            int r0 = r1.f1904G
            return r0
    }

    public p000a.p031h.p032a.AbstractC0231a getSuggestionsAdapter() {
            r1 = this;
            a.h.a.a r0 = r1.f1916S
            return r0
    }

    /* renamed from: h */
    void m2218h() {
            r2 = this;
            r0 = 0
            r2.m2228b(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            r0.requestFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            r1 = 1
            r0.setImeVisibility(r1)
            android.view.View$OnClickListener r0 = r2.f1913P
            if (r0 == 0) goto L_0x0016
            r0.onClick(r2)
        L_0x0016:
            return
    }

    /* renamed from: i */
    void m2217i() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1937q
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0031
            int r1 = android.text.TextUtils.getTrimmedLength(r0)
            if (r1 <= 0) goto L_0x0031
            androidx.appcompat.widget.SearchView$m r1 = r3.f1909L
            if (r1 == 0) goto L_0x001c
            java.lang.String r2 = r0.toString()
            boolean r1 = r1.m2199a(r2)
            if (r1 != 0) goto L_0x0031
        L_0x001c:
            android.app.SearchableInfo r1 = r3.f1927g0
            r2 = 0
            if (r1 == 0) goto L_0x0029
            r1 = 0
            java.lang.String r0 = r0.toString()
            r3.m2243a(r2, r1, r0)
        L_0x0029:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1937q
            r0.setImeVisibility(r2)
            r3.m2213m()
        L_0x0031:
            return
    }

    /* renamed from: j */
    void m2216j() {
            r1 = this;
            boolean r0 = r1.m2220f()
            r1.m2228b(r0)
            r1.m2210p()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1937q
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x0015
            r1.m2222e()
        L_0x0015:
            return
    }

    /* renamed from: k */
    void m2215k() {
            r2 = this;
            android.app.SearchableInfo r0 = r2.f1927g0
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r1 = r0.getVoiceSearchLaunchWebSearch()     // Catch: ActivityNotFoundException -> 0x0026
            if (r1 == 0) goto L_0x0019
            android.content.Intent r1 = r2.f1906I     // Catch: ActivityNotFoundException -> 0x0026
            android.content.Intent r0 = r2.m2230b(r1, r0)     // Catch: ActivityNotFoundException -> 0x0026
        L_0x0011:
            android.content.Context r1 = r2.getContext()     // Catch: ActivityNotFoundException -> 0x0026
            r1.startActivity(r0)     // Catch: ActivityNotFoundException -> 0x0026
            goto L_0x002d
        L_0x0019:
            boolean r1 = r0.getVoiceSearchLaunchRecognizer()     // Catch: ActivityNotFoundException -> 0x0026
            if (r1 == 0) goto L_0x002d
            android.content.Intent r1 = r2.f1907J     // Catch: ActivityNotFoundException -> 0x0026
            android.content.Intent r0 = r2.m2240a(r1, r0)     // Catch: ActivityNotFoundException -> 0x0026
            goto L_0x0011
        L_0x0026:
            java.lang.String r0 = "SearchView"
            java.lang.String r1 = "Could not find voice search activity"
            android.util.Log.w(r0, r1)
        L_0x002d:
            return
    }

    /* renamed from: l */
    void m2214l() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x000b
            int[] r0 = android.view.ViewGroup.FOCUSED_STATE_SET
            goto L_0x000d
        L_0x000b:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        L_0x000d:
            android.view.View r1 = r2.f1940s
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L_0x0018
            r1.setState(r0)
        L_0x0018:
            android.view.View r1 = r2.f1941t
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L_0x0023
            r1.setState(r0)
        L_0x0023:
            r2.invalidate()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            java.lang.Runnable r0 = r1.f1929i0
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.f1930j0
            r1.post(r0)
            super.onDetachedFromWindow()
            return
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            if (r2 == 0) goto L_0x0037
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f1937q
            android.graphics.Rect r3 = r1.f1898A
            r1.m2237a(r2, r3)
            android.graphics.Rect r2 = r1.f1899B
            android.graphics.Rect r3 = r1.f1898A
            int r5 = r3.left
            r0 = 0
            int r3 = r3.right
            int r6 = r6 - r4
            r2.set(r5, r0, r3, r6)
            androidx.appcompat.widget.SearchView$p r2 = r1.f1947z
            if (r2 != 0) goto L_0x0030
            androidx.appcompat.widget.SearchView$p r2 = new androidx.appcompat.widget.SearchView$p
            android.graphics.Rect r3 = r1.f1899B
            android.graphics.Rect r4 = r1.f1898A
            androidx.appcompat.widget.SearchView$SearchAutoComplete r5 = r1.f1937q
            r2.<init>(r3, r4, r5)
            r1.f1947z = r2
            androidx.appcompat.widget.SearchView$p r2 = r1.f1947z
            r1.setTouchDelegate(r2)
            goto L_0x0037
        L_0x0030:
            android.graphics.Rect r3 = r1.f1899B
            android.graphics.Rect r4 = r1.f1898A
            r2.m2195a(r3, r4)
        L_0x0037:
            return
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.m2220f()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f1921a0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f1921a0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f1921a0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.SearchView.C0552o
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r2)
            return
        L_0x0008:
            androidx.appcompat.widget.SearchView$o r2 = (androidx.appcompat.widget.SearchView.C0552o) r2
            android.os.Parcelable r0 = r2.m3347a()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.f1966d
            r1.m2228b(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.SearchView$o r1 = new androidx.appcompat.widget.SearchView$o
            r1.<init>(r0)
            boolean r0 = r2.m2220f()
            r1.f1966d = r0
            return r1
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            r0.m2210p()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int r3, android.graphics.Rect r4) {
            r2 = this;
            boolean r0 = r2.f1920W
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r2.isFocusable()
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            boolean r0 = r2.m2220f()
            if (r0 != 0) goto L_0x001f
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1937q
            boolean r3 = r0.requestFocus(r3, r4)
            if (r3 == 0) goto L_0x001e
            r2.m2228b(r1)
        L_0x001e:
            return r3
        L_0x001f:
            boolean r3 = super.requestFocus(r3, r4)
            return r3
    }

    public void setAppSearchData(android.os.Bundle r1) {
            r0 = this;
            r0.f1928h0 = r1
            return
    }

    public void setIconified(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L_0x0006
            r0.m2219g()
            goto L_0x0009
        L_0x0006:
            r0.m2218h()
        L_0x0009:
            return
    }

    public void setIconifiedByDefault(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1914Q
            if (r0 != r2) goto L_0x0005
            return
        L_0x0005:
            r1.f1914Q = r2
            r1.m2228b(r2)
            r1.m2208r()
            return
    }

    public void setImeOptions(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1937q
            r0.setImeOptions(r2)
            return
    }

    public void setInputType(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1937q
            r0.setInputType(r2)
            return
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.f1921a0 = r1
            r0.requestLayout()
            return
    }

    public void setOnCloseListener(androidx.appcompat.widget.SearchView.AbstractC0549l r1) {
            r0 = this;
            r0.f1910M = r1
            return
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener r1) {
            r0 = this;
            r0.f1911N = r1
            return
    }

    public void setOnQueryTextListener(androidx.appcompat.widget.SearchView.AbstractC0550m r1) {
            r0 = this;
            r0.f1909L = r1
            return
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.f1913P = r1
            return
    }

    public void setOnSuggestionListener(androidx.appcompat.widget.SearchView.AbstractC0551n r1) {
            r0 = this;
            r0.f1912O = r1
            return
    }

    public void setQueryHint(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1918U = r1
            r0.m2208r()
            return
    }

    public void setQueryRefinementEnabled(boolean r3) {
            r2 = this;
            r2.f1919V = r3
            a.h.a.a r0 = r2.f1916S
            boolean r1 = r0 instanceof androidx.appcompat.widget.View$OnClickListenerC0625n0
            if (r1 == 0) goto L_0x0012
            androidx.appcompat.widget.n0 r0 = (androidx.appcompat.widget.View$OnClickListenerC0625n0) r0
            if (r3 == 0) goto L_0x000e
            r3 = 2
            goto L_0x000f
        L_0x000e:
            r3 = 1
        L_0x000f:
            r0.m1945a(r3)
        L_0x0012:
            return
    }

    public void setSearchableInfo(android.app.SearchableInfo r2) {
            r1 = this;
            r1.f1927g0 = r2
            android.app.SearchableInfo r2 = r1.f1927g0
            if (r2 == 0) goto L_0x000c
            r1.m2207s()
            r1.m2208r()
        L_0x000c:
            boolean r2 = r1.m2212n()
            r1.f1922b0 = r2
            boolean r2 = r1.f1922b0
            if (r2 == 0) goto L_0x001d
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f1937q
            java.lang.String r0 = "nm"
            r2.setPrivateImeOptions(r0)
        L_0x001d:
            boolean r2 = r1.m2220f()
            r1.m2228b(r2)
            return
    }

    public void setSubmitButtonEnabled(boolean r1) {
            r0 = this;
            r0.f1917T = r1
            boolean r1 = r0.m2220f()
            r0.m2228b(r1)
            return
    }

    public void setSuggestionsAdapter(p000a.p031h.p032a.AbstractC0231a r2) {
            r1 = this;
            r1.f1916S = r2
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f1937q
            a.h.a.a r0 = r1.f1916S
            r2.setAdapter(r0)
            return
    }
}
