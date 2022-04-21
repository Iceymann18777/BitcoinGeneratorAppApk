package androidx.appcompat.app;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A */
    androidx.core.widget.NestedScrollView f1277A;

    /* renamed from: B */
    private int f1278B;

    /* renamed from: C */
    private android.graphics.drawable.Drawable f1279C;

    /* renamed from: D */
    private android.widget.ImageView f1280D;

    /* renamed from: E */
    private android.widget.TextView f1281E;

    /* renamed from: F */
    private android.widget.TextView f1282F;

    /* renamed from: G */
    private android.view.View f1283G;

    /* renamed from: H */
    android.widget.ListAdapter f1284H;

    /* renamed from: I */
    int f1285I;

    /* renamed from: J */
    private int f1286J;

    /* renamed from: K */
    private int f1287K;

    /* renamed from: L */
    int f1288L;

    /* renamed from: M */
    int f1289M;

    /* renamed from: N */
    int f1290N;

    /* renamed from: O */
    int f1291O;

    /* renamed from: P */
    private boolean f1292P;

    /* renamed from: Q */
    private int f1293Q;

    /* renamed from: R */
    android.os.Handler f1294R;

    /* renamed from: S */
    private final android.view.View.OnClickListener f1295S;

    /* renamed from: a */
    private final android.content.Context f1296a;

    /* renamed from: b */
    final androidx.appcompat.app.DialogC0464i f1297b;

    /* renamed from: c */
    private final android.view.Window f1298c;

    /* renamed from: d */
    private final int f1299d;

    /* renamed from: e */
    private java.lang.CharSequence f1300e;

    /* renamed from: f */
    private java.lang.CharSequence f1301f;

    /* renamed from: g */
    android.widget.ListView f1302g;

    /* renamed from: h */
    private android.view.View f1303h;

    /* renamed from: i */
    private int f1304i;

    /* renamed from: j */
    private int f1305j;

    /* renamed from: k */
    private int f1306k;

    /* renamed from: l */
    private int f1307l;

    /* renamed from: m */
    private int f1308m;

    /* renamed from: n */
    private boolean f1309n;

    /* renamed from: o */
    android.widget.Button f1310o;

    /* renamed from: p */
    private java.lang.CharSequence f1311p;

    /* renamed from: q */
    android.os.Message f1312q;

    /* renamed from: r */
    private android.graphics.drawable.Drawable f1313r;

    /* renamed from: s */
    android.widget.Button f1314s;

    /* renamed from: t */
    private java.lang.CharSequence f1315t;

    /* renamed from: u */
    android.os.Message f1316u;

    /* renamed from: v */
    private android.graphics.drawable.Drawable f1317v;

    /* renamed from: w */
    android.widget.Button f1318w;

    /* renamed from: x */
    private java.lang.CharSequence f1319x;

    /* renamed from: y */
    android.os.Message f1320y;

    /* renamed from: z */
    private android.graphics.drawable.Drawable f1321z;

    /* loaded from: classes.dex */
    public static class RecycleListView extends android.widget.ListView {

        /* renamed from: b */
        private final int f1322b;

        /* renamed from: c */
        private final int f1323c;

        public RecycleListView(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public RecycleListView(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = p000a.p001a.C0009j.RecycleListView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = p000a.p001a.C0009j.RecycleListView_paddingBottomNoButtons
                r0 = -1
                int r3 = r2.getDimensionPixelOffset(r3, r0)
                r1.f1323c = r3
                int r3 = p000a.p001a.C0009j.RecycleListView_paddingTopNoTitle
                int r2 = r2.getDimensionPixelOffset(r3, r0)
                r1.f1322b = r2
                return
        }

        /* renamed from: a */
        public void m2665a(boolean r3, boolean r4) {
                r2 = this;
                if (r4 == 0) goto L_0x0004
                if (r3 != 0) goto L_0x0021
            L_0x0004:
                int r0 = r2.getPaddingLeft()
                if (r3 == 0) goto L_0x000f
                int r3 = r2.getPaddingTop()
                goto L_0x0011
            L_0x000f:
                int r3 = r2.f1322b
            L_0x0011:
                int r1 = r2.getPaddingRight()
                if (r4 == 0) goto L_0x001c
                int r4 = r2.getPaddingBottom()
                goto L_0x001e
            L_0x001c:
                int r4 = r2.f1323c
            L_0x001e:
                r2.setPadding(r0, r3, r1, r4)
            L_0x0021:
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0414a implements android.view.View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.AlertController f1324b;

        View$OnClickListenerC0414a(androidx.appcompat.app.AlertController r1) {
                r0 = this;
                r0.f1324b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.app.AlertController r0 = r2.f1324b
                android.widget.Button r1 = r0.f1310o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f1312q
                if (r0 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002a
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = r2.f1324b
                android.widget.Button r1 = r0.f1314s
                if (r3 != r1) goto L_0x001a
                android.os.Message r0 = r0.f1316u
                if (r0 == 0) goto L_0x001a
                goto L_0x000a
            L_0x001a:
                androidx.appcompat.app.AlertController r0 = r2.f1324b
                android.widget.Button r1 = r0.f1318w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f1320y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = r2.f1324b
                android.os.Handler r0 = r3.f1294R
                r1 = 1
                androidx.appcompat.app.i r3 = r3.f1297b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    class C0415b implements androidx.core.widget.NestedScrollView.AbstractC0707b {

        /* renamed from: a */
        final /* synthetic */ android.view.View f1325a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f1326b;

        C0415b(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.f1325a = r2
                r0.f1326b = r3
                r0.<init>()
                return
        }

        @Override // androidx.core.widget.NestedScrollView.AbstractC0707b
        /* renamed from: a */
        public void mo1545a(androidx.core.widget.NestedScrollView r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                android.view.View r2 = r0.f1325a
                android.view.View r3 = r0.f1326b
                androidx.appcompat.app.AlertController.m2681a(r1, r2, r3)
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    class RunnableC0416c implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ android.view.View f1327b;

        /* renamed from: c */
        final /* synthetic */ android.view.View f1328c;

        /* renamed from: d */
        final /* synthetic */ androidx.appcompat.app.AlertController f1329d;

        RunnableC0416c(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.f1329d = r1
                r0.f1327b = r2
                r0.f1328c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.app.AlertController r0 = r3.f1329d
                androidx.core.widget.NestedScrollView r0 = r0.f1277A
                android.view.View r1 = r3.f1327b
                android.view.View r2 = r3.f1328c
                androidx.appcompat.app.AlertController.m2681a(r0, r1, r2)
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    class C0417d implements android.widget.AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ android.view.View f1330a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f1331b;

        C0417d(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.f1330a = r2
                r0.f1331b = r3
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                android.view.View r2 = r0.f1330a
                android.view.View r3 = r0.f1331b
                androidx.appcompat.app.AlertController.m2681a(r1, r2, r3)
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    class RunnableC0418e implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ android.view.View f1332b;

        /* renamed from: c */
        final /* synthetic */ android.view.View f1333c;

        /* renamed from: d */
        final /* synthetic */ androidx.appcompat.app.AlertController f1334d;

        RunnableC0418e(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.f1334d = r1
                r0.f1332b = r2
                r0.f1333c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.app.AlertController r0 = r3.f1334d
                android.widget.ListView r0 = r0.f1302g
                android.view.View r1 = r3.f1332b
                android.view.View r2 = r3.f1333c
                androidx.appcompat.app.AlertController.m2681a(r0, r1, r2)
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0419f {

        /* renamed from: A */
        public int f1335A;

        /* renamed from: B */
        public int f1336B;

        /* renamed from: C */
        public int f1337C;

        /* renamed from: D */
        public int f1338D;

        /* renamed from: E */
        public boolean f1339E;

        /* renamed from: F */
        public boolean[] f1340F;

        /* renamed from: G */
        public boolean f1341G;

        /* renamed from: H */
        public boolean f1342H;

        /* renamed from: I */
        public int f1343I;

        /* renamed from: J */
        public android.content.DialogInterface.OnMultiChoiceClickListener f1344J;

        /* renamed from: K */
        public android.database.Cursor f1345K;

        /* renamed from: L */
        public java.lang.String f1346L;

        /* renamed from: M */
        public java.lang.String f1347M;

        /* renamed from: N */
        public android.widget.AdapterView.OnItemSelectedListener f1348N;

        /* renamed from: O */
        public androidx.appcompat.app.AlertController.C0419f.AbstractC0424e f1349O;

        /* renamed from: a */
        public final android.content.Context f1350a;

        /* renamed from: b */
        public final android.view.LayoutInflater f1351b;

        /* renamed from: c */
        public int f1352c;

        /* renamed from: d */
        public android.graphics.drawable.Drawable f1353d;

        /* renamed from: e */
        public int f1354e;

        /* renamed from: f */
        public java.lang.CharSequence f1355f;

        /* renamed from: g */
        public android.view.View f1356g;

        /* renamed from: h */
        public java.lang.CharSequence f1357h;

        /* renamed from: i */
        public java.lang.CharSequence f1358i;

        /* renamed from: j */
        public android.graphics.drawable.Drawable f1359j;

        /* renamed from: k */
        public android.content.DialogInterface.OnClickListener f1360k;

        /* renamed from: l */
        public java.lang.CharSequence f1361l;

        /* renamed from: m */
        public android.graphics.drawable.Drawable f1362m;

        /* renamed from: n */
        public android.content.DialogInterface.OnClickListener f1363n;

        /* renamed from: o */
        public java.lang.CharSequence f1364o;

        /* renamed from: p */
        public android.graphics.drawable.Drawable f1365p;

        /* renamed from: q */
        public android.content.DialogInterface.OnClickListener f1366q;

        /* renamed from: r */
        public boolean f1367r;

        /* renamed from: s */
        public android.content.DialogInterface.OnCancelListener f1368s;

        /* renamed from: t */
        public android.content.DialogInterface.OnDismissListener f1369t;

        /* renamed from: u */
        public android.content.DialogInterface.OnKeyListener f1370u;

        /* renamed from: v */
        public java.lang.CharSequence[] f1371v;

        /* renamed from: w */
        public android.widget.ListAdapter f1372w;

        /* renamed from: x */
        public android.content.DialogInterface.OnClickListener f1373x;

        /* renamed from: y */
        public int f1374y;

        /* renamed from: z */
        public android.view.View f1375z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes.dex */
        class C0420a extends android.widget.ArrayAdapter<java.lang.CharSequence> {

            /* renamed from: b */
            final /* synthetic */ androidx.appcompat.app.AlertController.RecycleListView f1376b;

            /* renamed from: c */
            final /* synthetic */ androidx.appcompat.app.AlertController.C0419f f1377c;

            C0420a(androidx.appcompat.app.AlertController.C0419f r1, android.content.Context r2, int r3, int r4, java.lang.CharSequence[] r5, androidx.appcompat.app.AlertController.RecycleListView r6) {
                    r0 = this;
                    r0.f1377c = r1
                    r0.f1376b = r6
                    r0.<init>(r2, r3, r4, r5)
                    return
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                    r1 = this;
                    android.view.View r3 = super.getView(r2, r3, r4)
                    androidx.appcompat.app.AlertController$f r4 = r1.f1377c
                    boolean[] r4 = r4.f1340F
                    if (r4 == 0) goto L_0x0014
                    boolean r4 = r4[r2]
                    if (r4 == 0) goto L_0x0014
                    androidx.appcompat.app.AlertController$RecycleListView r4 = r1.f1376b
                    r0 = 1
                    r4.setItemChecked(r2, r0)
                L_0x0014:
                    return r3
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes.dex */
        class C0421b extends android.widget.CursorAdapter {

            /* renamed from: b */
            private final int f1378b;

            /* renamed from: c */
            private final int f1379c;

            /* renamed from: d */
            final /* synthetic */ androidx.appcompat.app.AlertController.RecycleListView f1380d;

            /* renamed from: e */
            final /* synthetic */ androidx.appcompat.app.AlertController f1381e;

            /* renamed from: f */
            final /* synthetic */ androidx.appcompat.app.AlertController.C0419f f1382f;

            C0421b(androidx.appcompat.app.AlertController.C0419f r1, android.content.Context r2, android.database.Cursor r3, boolean r4, androidx.appcompat.app.AlertController.RecycleListView r5, androidx.appcompat.app.AlertController r6) {
                    r0 = this;
                    r0.f1382f = r1
                    r0.f1380d = r5
                    r0.f1381e = r6
                    r0.<init>(r2, r3, r4)
                    android.database.Cursor r1 = r0.getCursor()
                    androidx.appcompat.app.AlertController$f r2 = r0.f1382f
                    java.lang.String r2 = r2.f1346L
                    int r2 = r1.getColumnIndexOrThrow(r2)
                    r0.f1378b = r2
                    androidx.appcompat.app.AlertController$f r2 = r0.f1382f
                    java.lang.String r2 = r2.f1347M
                    int r1 = r1.getColumnIndexOrThrow(r2)
                    r0.f1379c = r1
                    return
            }

            @Override // android.widget.CursorAdapter
            public void bindView(android.view.View r2, android.content.Context r3, android.database.Cursor r4) {
                    r1 = this;
                    r3 = 16908308(0x1020014, float:2.3877285E-38)
                    android.view.View r2 = r2.findViewById(r3)
                    android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2
                    int r3 = r1.f1378b
                    java.lang.String r3 = r4.getString(r3)
                    r2.setText(r3)
                    androidx.appcompat.app.AlertController$RecycleListView r2 = r1.f1380d
                    int r3 = r4.getPosition()
                    int r0 = r1.f1379c
                    int r4 = r4.getInt(r0)
                    r0 = 1
                    if (r4 != r0) goto L_0x0022
                    goto L_0x0023
                L_0x0022:
                    r0 = 0
                L_0x0023:
                    r2.setItemChecked(r3, r0)
                    return
            }

            @Override // android.widget.CursorAdapter
            public android.view.View newView(android.content.Context r2, android.database.Cursor r3, android.view.ViewGroup r4) {
                    r1 = this;
                    androidx.appcompat.app.AlertController$f r2 = r1.f1382f
                    android.view.LayoutInflater r2 = r2.f1351b
                    androidx.appcompat.app.AlertController r3 = r1.f1381e
                    int r3 = r3.f1289M
                    r0 = 0
                    android.view.View r2 = r2.inflate(r3, r4, r0)
                    return r2
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes.dex */
        class C0422c implements android.widget.AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ androidx.appcompat.app.AlertController f1383b;

            /* renamed from: c */
            final /* synthetic */ androidx.appcompat.app.AlertController.C0419f f1384c;

            C0422c(androidx.appcompat.app.AlertController.C0419f r1, androidx.appcompat.app.AlertController r2) {
                    r0 = this;
                    r0.f1384c = r1
                    r0.f1383b = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                    r0 = this;
                    androidx.appcompat.app.AlertController$f r1 = r0.f1384c
                    android.content.DialogInterface$OnClickListener r1 = r1.f1373x
                    androidx.appcompat.app.AlertController r2 = r0.f1383b
                    androidx.appcompat.app.i r2 = r2.f1297b
                    r1.onClick(r2, r3)
                    androidx.appcompat.app.AlertController$f r1 = r0.f1384c
                    boolean r1 = r1.f1342H
                    if (r1 != 0) goto L_0x0018
                    androidx.appcompat.app.AlertController r1 = r0.f1383b
                    androidx.appcompat.app.i r1 = r1.f1297b
                    r1.dismiss()
                L_0x0018:
                    return
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes.dex */
        class C0423d implements android.widget.AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ androidx.appcompat.app.AlertController.RecycleListView f1385b;

            /* renamed from: c */
            final /* synthetic */ androidx.appcompat.app.AlertController f1386c;

            /* renamed from: d */
            final /* synthetic */ androidx.appcompat.app.AlertController.C0419f f1387d;

            C0423d(androidx.appcompat.app.AlertController.C0419f r1, androidx.appcompat.app.AlertController.RecycleListView r2, androidx.appcompat.app.AlertController r3) {
                    r0 = this;
                    r0.f1387d = r1
                    r0.f1385b = r2
                    r0.f1386c = r3
                    r0.<init>()
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                    r0 = this;
                    androidx.appcompat.app.AlertController$f r1 = r0.f1387d
                    boolean[] r1 = r1.f1340F
                    if (r1 == 0) goto L_0x000e
                    androidx.appcompat.app.AlertController$RecycleListView r2 = r0.f1385b
                    boolean r2 = r2.isItemChecked(r3)
                    r1[r3] = r2
                L_0x000e:
                    androidx.appcompat.app.AlertController$f r1 = r0.f1387d
                    android.content.DialogInterface$OnMultiChoiceClickListener r1 = r1.f1344J
                    androidx.appcompat.app.AlertController r2 = r0.f1386c
                    androidx.appcompat.app.i r2 = r2.f1297b
                    androidx.appcompat.app.AlertController$RecycleListView r4 = r0.f1385b
                    boolean r4 = r4.isItemChecked(r3)
                    r1.onClick(r2, r3, r4)
                    return
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: classes.dex */
        public interface AbstractC0424e {
            /* renamed from: a */
            void m2662a(android.widget.ListView r1);
        }

        public C0419f(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1352c = r0
                r1.f1354e = r0
                r1.f1339E = r0
                r0 = -1
                r1.f1343I = r0
                r1.f1350a = r2
                r0 = 1
                r1.f1367r = r0
                java.lang.String r0 = "layout_inflater"
                java.lang.Object r2 = r2.getSystemService(r0)
                android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
                r1.f1351b = r2
                return
        }

        /* renamed from: b */
        private void m2663b(androidx.appcompat.app.AlertController r12) {
                r11 = this;
                android.view.LayoutInflater r0 = r11.f1351b
                int r1 = r12.f1288L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f1341G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f1345K
                if (r4 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r11.f1350a
                int r4 = r12.f1289M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f1371v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r11.f1350a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f1342H
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f1290N
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f1291O
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f1345K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f1350a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f1346L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f1372w
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r2 = r11.f1350a
                java.lang.CharSequence[] r3 = r11.f1371v
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                androidx.appcompat.app.AlertController$f$e r1 = r11.f1349O
                if (r1 == 0) goto L_0x006e
                r1.m2662a(r0)
            L_0x006e:
                r12.f1284H = r9
                int r1 = r11.f1343I
                r12.f1285I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f1373x
                if (r1 == 0) goto L_0x0081
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11, r12)
            L_0x007d:
                r0.setOnItemClickListener(r1)
                goto L_0x008b
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f1344J
                if (r1 == 0) goto L_0x008b
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r11, r0, r12)
                goto L_0x007d
            L_0x008b:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f1348N
                if (r1 == 0) goto L_0x0092
                r0.setOnItemSelectedListener(r1)
            L_0x0092:
                boolean r1 = r11.f1342H
                if (r1 == 0) goto L_0x009a
                r0.setChoiceMode(r8)
                goto L_0x00a2
            L_0x009a:
                boolean r1 = r11.f1341G
                if (r1 == 0) goto L_0x00a2
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a2:
                r12.f1302g = r0
                return
        }

        /* renamed from: a */
        public void m2664a(androidx.appcompat.app.AlertController r8) {
                r7 = this;
                android.view.View r0 = r7.f1356g
                if (r0 == 0) goto L_0x0008
                r8.m2684a(r0)
                goto L_0x0028
            L_0x0008:
                java.lang.CharSequence r0 = r7.f1355f
                if (r0 == 0) goto L_0x000f
                r8.m2671b(r0)
            L_0x000f:
                android.graphics.drawable.Drawable r0 = r7.f1353d
                if (r0 == 0) goto L_0x0016
                r8.m2685a(r0)
            L_0x0016:
                int r0 = r7.f1352c
                if (r0 == 0) goto L_0x001d
                r8.m2675b(r0)
            L_0x001d:
                int r0 = r7.f1354e
                if (r0 == 0) goto L_0x0028
                int r0 = r8.m2689a(r0)
                r8.m2675b(r0)
            L_0x0028:
                java.lang.CharSequence r0 = r7.f1357h
                if (r0 == 0) goto L_0x002f
                r8.m2677a(r0)
            L_0x002f:
                java.lang.CharSequence r0 = r7.f1358i
                if (r0 != 0) goto L_0x0037
                android.graphics.drawable.Drawable r0 = r7.f1359j
                if (r0 == 0) goto L_0x0043
            L_0x0037:
                r2 = -1
                java.lang.CharSequence r3 = r7.f1358i
                android.content.DialogInterface$OnClickListener r4 = r7.f1360k
                r5 = 0
                android.graphics.drawable.Drawable r6 = r7.f1359j
                r1 = r8
                r1.m2687a(r2, r3, r4, r5, r6)
            L_0x0043:
                java.lang.CharSequence r0 = r7.f1361l
                if (r0 != 0) goto L_0x004b
                android.graphics.drawable.Drawable r0 = r7.f1362m
                if (r0 == 0) goto L_0x0057
            L_0x004b:
                r2 = -2
                java.lang.CharSequence r3 = r7.f1361l
                android.content.DialogInterface$OnClickListener r4 = r7.f1363n
                r5 = 0
                android.graphics.drawable.Drawable r6 = r7.f1362m
                r1 = r8
                r1.m2687a(r2, r3, r4, r5, r6)
            L_0x0057:
                java.lang.CharSequence r0 = r7.f1364o
                if (r0 != 0) goto L_0x005f
                android.graphics.drawable.Drawable r0 = r7.f1365p
                if (r0 == 0) goto L_0x006b
            L_0x005f:
                r2 = -3
                java.lang.CharSequence r3 = r7.f1364o
                android.content.DialogInterface$OnClickListener r4 = r7.f1366q
                r5 = 0
                android.graphics.drawable.Drawable r6 = r7.f1365p
                r1 = r8
                r1.m2687a(r2, r3, r4, r5, r6)
            L_0x006b:
                java.lang.CharSequence[] r0 = r7.f1371v
                if (r0 != 0) goto L_0x0077
                android.database.Cursor r0 = r7.f1345K
                if (r0 != 0) goto L_0x0077
                android.widget.ListAdapter r0 = r7.f1372w
                if (r0 == 0) goto L_0x007a
            L_0x0077:
                r7.m2663b(r8)
            L_0x007a:
                android.view.View r2 = r7.f1375z
                if (r2 == 0) goto L_0x0093
                boolean r0 = r7.f1339E
                if (r0 == 0) goto L_0x008f
                int r3 = r7.f1335A
                int r4 = r7.f1336B
                int r5 = r7.f1337C
                int r6 = r7.f1338D
                r1 = r8
                r1.m2683a(r2, r3, r4, r5, r6)
                goto L_0x009a
            L_0x008f:
                r8.m2673b(r2)
                goto L_0x009a
            L_0x0093:
                int r0 = r7.f1374y
                if (r0 == 0) goto L_0x009a
                r8.m2669c(r0)
            L_0x009a:
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    private static final class HandlerC0425g extends android.os.Handler {

        /* renamed from: a */
        private java.lang.ref.WeakReference<android.content.DialogInterface> f1388a;

        public HandlerC0425g(android.content.DialogInterface r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f1388a = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = -3
                if (r0 == r1) goto L_0x0017
                r1 = -2
                if (r0 == r1) goto L_0x0017
                r1 = -1
                if (r0 == r1) goto L_0x0017
                r1 = 1
                if (r0 == r1) goto L_0x000f
                goto L_0x0028
            L_0x000f:
                java.lang.Object r3 = r3.obj
                android.content.DialogInterface r3 = (android.content.DialogInterface) r3
                r3.dismiss()
                goto L_0x0028
            L_0x0017:
                java.lang.Object r0 = r3.obj
                android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
                java.lang.ref.WeakReference<android.content.DialogInterface> r1 = r2.f1388a
                java.lang.Object r1 = r1.get()
                android.content.DialogInterface r1 = (android.content.DialogInterface) r1
                int r3 = r3.what
                r0.onClick(r1, r3)
            L_0x0028:
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes.dex */
    private static class C0426h extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        public C0426h(android.content.Context r1, int r2, int r3, java.lang.CharSequence[] r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public AlertController(android.content.Context r4, androidx.appcompat.app.DialogC0464i r5, android.view.Window r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f1309n = r0
            r3.f1278B = r0
            r1 = -1
            r3.f1285I = r1
            r3.f1293Q = r0
            androidx.appcompat.app.AlertController$a r1 = new androidx.appcompat.app.AlertController$a
            r1.<init>(r3)
            r3.f1295S = r1
            r3.f1296a = r4
            r3.f1297b = r5
            r3.f1298c = r6
            androidx.appcompat.app.AlertController$g r6 = new androidx.appcompat.app.AlertController$g
            r6.<init>(r5)
            r3.f1294R = r6
            int[] r6 = p000a.p001a.C0009j.AlertDialog
            int r1 = p000a.p001a.C0000a.alertDialogStyle
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r2, r6, r1, r0)
            int r6 = p000a.p001a.C0009j.AlertDialog_android_layout
            int r6 = r4.getResourceId(r6, r0)
            r3.f1286J = r6
            int r6 = p000a.p001a.C0009j.AlertDialog_buttonPanelSideLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.f1287K = r6
            int r6 = p000a.p001a.C0009j.AlertDialog_listLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.f1288L = r6
            int r6 = p000a.p001a.C0009j.AlertDialog_multiChoiceItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.f1289M = r6
            int r6 = p000a.p001a.C0009j.AlertDialog_singleChoiceItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.f1290N = r6
            int r6 = p000a.p001a.C0009j.AlertDialog_listItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.f1291O = r6
            int r6 = p000a.p001a.C0009j.AlertDialog_showTitle
            r1 = 1
            boolean r6 = r4.getBoolean(r6, r1)
            r3.f1292P = r6
            int r6 = p000a.p001a.C0009j.AlertDialog_buttonIconDimen
            int r6 = r4.getDimensionPixelSize(r6, r0)
            r3.f1299d = r6
            r4.recycle()
            r5.m2530a(r1)
            return
    }

    /* renamed from: a */
    private android.view.ViewGroup m2682a(android.view.View r3, android.view.View r4) {
            r2 = this;
            if (r3 != 0) goto L_0x000f
            boolean r3 = r4 instanceof android.view.ViewStub
            if (r3 == 0) goto L_0x000c
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r4 = r4.inflate()
        L_0x000c:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            return r4
        L_0x000f:
            if (r4 == 0) goto L_0x001e
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x001e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r4)
        L_0x001e:
            boolean r4 = r3 instanceof android.view.ViewStub
            if (r4 == 0) goto L_0x0028
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        L_0x0028:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
    }

    /* renamed from: a */
    static void m2681a(android.view.View r3, android.view.View r4, android.view.View r5) {
            r0 = 0
            r1 = 4
            if (r4 == 0) goto L_0x0011
            r2 = -1
            boolean r2 = r3.canScrollVertically(r2)
            if (r2 == 0) goto L_0x000d
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 4
        L_0x000e:
            r4.setVisibility(r2)
        L_0x0011:
            if (r5 == 0) goto L_0x001f
            r4 = 1
            boolean r3 = r3.canScrollVertically(r4)
            if (r3 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = 4
        L_0x001c:
            r5.setVisibility(r0)
        L_0x001f:
            return
    }

    /* renamed from: a */
    private void m2680a(android.view.ViewGroup r8) {
            r7 = this;
            r0 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r7.f1310o = r0
            android.widget.Button r0 = r7.f1310o
            android.view.View$OnClickListener r1 = r7.f1295S
            r0.setOnClickListener(r1)
            java.lang.CharSequence r0 = r7.f1311p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r2 = 8
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x002a
            android.graphics.drawable.Drawable r0 = r7.f1313r
            if (r0 != 0) goto L_0x002a
            android.widget.Button r0 = r7.f1310o
            r0.setVisibility(r2)
            r0 = 0
            goto L_0x0047
        L_0x002a:
            android.widget.Button r0 = r7.f1310o
            java.lang.CharSequence r5 = r7.f1311p
            r0.setText(r5)
            android.graphics.drawable.Drawable r0 = r7.f1313r
            if (r0 == 0) goto L_0x0041
            int r5 = r7.f1299d
            r0.setBounds(r4, r4, r5, r5)
            android.widget.Button r0 = r7.f1310o
            android.graphics.drawable.Drawable r5 = r7.f1313r
            r0.setCompoundDrawables(r5, r3, r3, r3)
        L_0x0041:
            android.widget.Button r0 = r7.f1310o
            r0.setVisibility(r4)
            r0 = 1
        L_0x0047:
            r5 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r5 = r8.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r7.f1314s = r5
            android.widget.Button r5 = r7.f1314s
            android.view.View$OnClickListener r6 = r7.f1295S
            r5.setOnClickListener(r6)
            java.lang.CharSequence r5 = r7.f1315t
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x006b
            android.graphics.drawable.Drawable r5 = r7.f1317v
            if (r5 != 0) goto L_0x006b
            android.widget.Button r5 = r7.f1314s
            r5.setVisibility(r2)
            goto L_0x0089
        L_0x006b:
            android.widget.Button r5 = r7.f1314s
            java.lang.CharSequence r6 = r7.f1315t
            r5.setText(r6)
            android.graphics.drawable.Drawable r5 = r7.f1317v
            if (r5 == 0) goto L_0x0082
            int r6 = r7.f1299d
            r5.setBounds(r4, r4, r6, r6)
            android.widget.Button r5 = r7.f1314s
            android.graphics.drawable.Drawable r6 = r7.f1317v
            r5.setCompoundDrawables(r6, r3, r3, r3)
        L_0x0082:
            android.widget.Button r5 = r7.f1314s
            r5.setVisibility(r4)
            r0 = r0 | 2
        L_0x0089:
            r5 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r5 = r8.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r7.f1318w = r5
            android.widget.Button r5 = r7.f1318w
            android.view.View$OnClickListener r6 = r7.f1295S
            r5.setOnClickListener(r6)
            java.lang.CharSequence r5 = r7.f1319x
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00ad
            android.graphics.drawable.Drawable r5 = r7.f1321z
            if (r5 != 0) goto L_0x00ad
            android.widget.Button r3 = r7.f1318w
            r3.setVisibility(r2)
            goto L_0x00cb
        L_0x00ad:
            android.widget.Button r5 = r7.f1318w
            java.lang.CharSequence r6 = r7.f1319x
            r5.setText(r6)
            android.graphics.drawable.Drawable r5 = r7.f1313r
            if (r5 == 0) goto L_0x00c4
            int r6 = r7.f1299d
            r5.setBounds(r4, r4, r6, r6)
            android.widget.Button r5 = r7.f1310o
            android.graphics.drawable.Drawable r6 = r7.f1313r
            r5.setCompoundDrawables(r6, r3, r3, r3)
        L_0x00c4:
            android.widget.Button r3 = r7.f1318w
            r3.setVisibility(r4)
            r0 = r0 | 4
        L_0x00cb:
            android.content.Context r3 = r7.f1296a
            boolean r3 = m2686a(r3)
            if (r3 == 0) goto L_0x00e7
            if (r0 != r1) goto L_0x00db
            android.widget.Button r3 = r7.f1310o
        L_0x00d7:
            r7.m2678a(r3)
            goto L_0x00e7
        L_0x00db:
            r3 = 2
            if (r0 != r3) goto L_0x00e1
            android.widget.Button r3 = r7.f1314s
            goto L_0x00d7
        L_0x00e1:
            r3 = 4
            if (r0 != r3) goto L_0x00e7
            android.widget.Button r3 = r7.f1318w
            goto L_0x00d7
        L_0x00e7:
            if (r0 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r1 = 0
        L_0x00eb:
            if (r1 != 0) goto L_0x00f0
            r8.setVisibility(r2)
        L_0x00f0:
            return
    }

    /* renamed from: a */
    private void m2679a(android.view.ViewGroup r5, android.view.View r6, int r7, int r8) {
            r4 = this;
            android.view.Window r0 = r4.f1298c
            int r1 = p000a.p001a.C0005f.scrollIndicatorUp
            android.view.View r0 = r0.findViewById(r1)
            android.view.Window r1 = r4.f1298c
            int r2 = p000a.p001a.C0005f.scrollIndicatorDown
            android.view.View r1 = r1.findViewById(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L_0x0024
            p000a.p018g.p029l.C0216r.m3442a(r6, r7, r8)
            if (r0 == 0) goto L_0x001e
            r5.removeView(r0)
        L_0x001e:
            if (r1 == 0) goto L_0x0078
            r5.removeView(r1)
            goto L_0x0078
        L_0x0024:
            r6 = 0
            if (r0 == 0) goto L_0x002f
            r8 = r7 & 1
            if (r8 != 0) goto L_0x002f
            r5.removeView(r0)
            r0 = r6
        L_0x002f:
            if (r1 == 0) goto L_0x0039
            r7 = r7 & 2
            if (r7 != 0) goto L_0x0039
            r5.removeView(r1)
            goto L_0x003a
        L_0x0039:
            r6 = r1
        L_0x003a:
            if (r0 != 0) goto L_0x003e
            if (r6 == 0) goto L_0x0078
        L_0x003e:
            java.lang.CharSequence r7 = r4.f1301f
            if (r7 == 0) goto L_0x0057
            androidx.core.widget.NestedScrollView r5 = r4.f1277A
            androidx.appcompat.app.AlertController$b r7 = new androidx.appcompat.app.AlertController$b
            r7.<init>(r4, r0, r6)
            r5.setOnScrollChangeListener(r7)
            androidx.core.widget.NestedScrollView r5 = r4.f1277A
            androidx.appcompat.app.AlertController$c r7 = new androidx.appcompat.app.AlertController$c
            r7.<init>(r4, r0, r6)
            r5.post(r7)
            goto L_0x0078
        L_0x0057:
            android.widget.ListView r7 = r4.f1302g
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.app.AlertController$d r5 = new androidx.appcompat.app.AlertController$d
            r5.<init>(r4, r0, r6)
            r7.setOnScrollListener(r5)
            android.widget.ListView r5 = r4.f1302g
            androidx.appcompat.app.AlertController$e r7 = new androidx.appcompat.app.AlertController$e
            r7.<init>(r4, r0, r6)
            r5.post(r7)
            goto L_0x0078
        L_0x006e:
            if (r0 == 0) goto L_0x0073
            r5.removeView(r0)
        L_0x0073:
            if (r6 == 0) goto L_0x0078
            r5.removeView(r6)
        L_0x0078:
            return
    }

    /* renamed from: a */
    private void m2678a(android.widget.Button r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r1 = 1
            r0.gravity = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.weight = r1
            r3.setLayoutParams(r0)
            return
    }

    /* renamed from: a */
    private static boolean m2686a(android.content.Context r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r1 = p000a.p001a.C0000a.alertDialogCenterButtons
            r2 = 1
            r3.resolveAttribute(r1, r0, r2)
            int r3 = r0.data
            if (r3 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            return r2
    }

    /* renamed from: b */
    private int m2676b() {
            r3 = this;
            int r0 = r3.f1287K
            if (r0 != 0) goto L_0x0007
            int r0 = r3.f1286J
            return r0
        L_0x0007:
            int r1 = r3.f1293Q
            r2 = 1
            if (r1 != r2) goto L_0x000d
            return r0
        L_0x000d:
            int r0 = r3.f1286J
            return r0
    }

    /* renamed from: b */
    private void m2672b(android.view.ViewGroup r5) {
            r4 = this;
            android.view.Window r0 = r4.f1298c
            int r1 = p000a.p001a.C0005f.scrollView
            android.view.View r0 = r0.findViewById(r1)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r4.f1277A = r0
            androidx.core.widget.NestedScrollView r0 = r4.f1277A
            r1 = 0
            r0.setFocusable(r1)
            androidx.core.widget.NestedScrollView r0 = r4.f1277A
            r0.setNestedScrollingEnabled(r1)
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.f1282F = r0
            android.widget.TextView r0 = r4.f1282F
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            java.lang.CharSequence r1 = r4.f1301f
            if (r1 == 0) goto L_0x002f
            r0.setText(r1)
            goto L_0x005f
        L_0x002f:
            r1 = 8
            r0.setVisibility(r1)
            androidx.core.widget.NestedScrollView r0 = r4.f1277A
            android.widget.TextView r2 = r4.f1282F
            r0.removeView(r2)
            android.widget.ListView r0 = r4.f1302g
            if (r0 == 0) goto L_0x005c
            androidx.core.widget.NestedScrollView r5 = r4.f1277A
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            androidx.core.widget.NestedScrollView r0 = r4.f1277A
            int r0 = r5.indexOfChild(r0)
            r5.removeViewAt(r0)
            android.widget.ListView r1 = r4.f1302g
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r5.addView(r1, r0, r2)
            goto L_0x005f
        L_0x005c:
            r5.setVisibility(r1)
        L_0x005f:
            return
    }

    /* renamed from: c */
    private void m2670c() {
            r9 = this;
            android.view.Window r0 = r9.f1298c
            int r1 = p000a.p001a.C0005f.parentPanel
            android.view.View r0 = r0.findViewById(r1)
            int r1 = p000a.p001a.C0005f.topPanel
            android.view.View r1 = r0.findViewById(r1)
            int r2 = p000a.p001a.C0005f.contentPanel
            android.view.View r2 = r0.findViewById(r2)
            int r3 = p000a.p001a.C0005f.buttonPanel
            android.view.View r3 = r0.findViewById(r3)
            int r4 = p000a.p001a.C0005f.customPanel
            android.view.View r0 = r0.findViewById(r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r9.m2667c(r0)
            int r4 = p000a.p001a.C0005f.topPanel
            android.view.View r4 = r0.findViewById(r4)
            int r5 = p000a.p001a.C0005f.contentPanel
            android.view.View r5 = r0.findViewById(r5)
            int r6 = p000a.p001a.C0005f.buttonPanel
            android.view.View r6 = r0.findViewById(r6)
            android.view.ViewGroup r1 = r9.m2682a(r4, r1)
            android.view.ViewGroup r2 = r9.m2682a(r5, r2)
            android.view.ViewGroup r3 = r9.m2682a(r6, r3)
            r9.m2672b(r2)
            r9.m2680a(r3)
            r9.m2666d(r1)
            r4 = 8
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x005a
            int r0 = r0.getVisibility()
            if (r0 == r4) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r1 == 0) goto L_0x0065
            int r7 = r1.getVisibility()
            if (r7 == r4) goto L_0x0065
            r7 = 1
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            if (r3 == 0) goto L_0x0070
            int r3 = r3.getVisibility()
            if (r3 == r4) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            if (r3 != 0) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            int r4 = p000a.p001a.C0005f.textSpacerNoButtons
            android.view.View r4 = r2.findViewById(r4)
            if (r4 == 0) goto L_0x0080
            r4.setVisibility(r6)
        L_0x0080:
            if (r7 == 0) goto L_0x009e
            androidx.core.widget.NestedScrollView r4 = r9.f1277A
            if (r4 == 0) goto L_0x0089
            r4.setClipToPadding(r5)
        L_0x0089:
            r4 = 0
            java.lang.CharSequence r8 = r9.f1301f
            if (r8 != 0) goto L_0x0092
            android.widget.ListView r8 = r9.f1302g
            if (r8 == 0) goto L_0x0098
        L_0x0092:
            int r4 = p000a.p001a.C0005f.titleDividerNoCustom
            android.view.View r4 = r1.findViewById(r4)
        L_0x0098:
            if (r4 == 0) goto L_0x00ab
            r4.setVisibility(r6)
            goto L_0x00ab
        L_0x009e:
            if (r2 == 0) goto L_0x00ab
            int r1 = p000a.p001a.C0005f.textSpacerNoTitle
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto L_0x00ab
            r1.setVisibility(r6)
        L_0x00ab:
            android.widget.ListView r1 = r9.f1302g
            boolean r4 = r1 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r4 == 0) goto L_0x00b6
            androidx.appcompat.app.AlertController$RecycleListView r1 = (androidx.appcompat.app.AlertController.RecycleListView) r1
            r1.m2665a(r7, r3)
        L_0x00b6:
            if (r0 != 0) goto L_0x00ca
            android.widget.ListView r0 = r9.f1302g
            if (r0 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            androidx.core.widget.NestedScrollView r0 = r9.f1277A
        L_0x00bf:
            if (r0 == 0) goto L_0x00ca
            if (r3 == 0) goto L_0x00c4
            r6 = 2
        L_0x00c4:
            r1 = r7 | r6
            r3 = 3
            r9.m2679a(r2, r0, r1, r3)
        L_0x00ca:
            android.widget.ListView r0 = r9.f1302g
            if (r0 == 0) goto L_0x00e0
            android.widget.ListAdapter r1 = r9.f1284H
            if (r1 == 0) goto L_0x00e0
            r0.setAdapter(r1)
            int r1 = r9.f1285I
            r2 = -1
            if (r1 <= r2) goto L_0x00e0
            r0.setItemChecked(r1, r5)
            r0.setSelection(r1)
        L_0x00e0:
            return
    }

    /* renamed from: c */
    private void m2667c(android.view.ViewGroup r6) {
            r5 = this;
            android.view.View r0 = r5.f1303h
            r1 = 0
            if (r0 == 0) goto L_0x0006
            goto L_0x0018
        L_0x0006:
            int r0 = r5.f1304i
            if (r0 == 0) goto L_0x0017
            android.content.Context r0 = r5.f1296a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.f1304i
            android.view.View r0 = r0.inflate(r2, r6, r1)
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x001b
            r1 = 1
        L_0x001b:
            if (r1 == 0) goto L_0x0023
            boolean r2 = m2668c(r0)
            if (r2 != 0) goto L_0x002a
        L_0x0023:
            android.view.Window r2 = r5.f1298c
            r3 = 131072(0x20000, float:1.83671E-40)
            r2.setFlags(r3, r3)
        L_0x002a:
            if (r1 == 0) goto L_0x005c
            android.view.Window r1 = r5.f1298c
            int r2 = p000a.p001a.C0005f.custom
            android.view.View r1 = r1.findViewById(r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r1.addView(r0, r2)
            boolean r0 = r5.f1309n
            if (r0 == 0) goto L_0x004e
            int r0 = r5.f1305j
            int r2 = r5.f1306k
            int r3 = r5.f1307l
            int r4 = r5.f1308m
            r1.setPadding(r0, r2, r3, r4)
        L_0x004e:
            android.widget.ListView r0 = r5.f1302g
            if (r0 == 0) goto L_0x0061
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.appcompat.widget.g0$a r6 = (androidx.appcompat.widget.C0593g0.C0594a) r6
            r0 = 0
            r6.f2124a = r0
            goto L_0x0061
        L_0x005c:
            r0 = 8
            r6.setVisibility(r0)
        L_0x0061:
            return
    }

    /* renamed from: c */
    static boolean m2668c(android.view.View r4) {
            boolean r0 = r4.onCheckIsTextEditor()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r4 instanceof android.view.ViewGroup
            r2 = 0
            if (r0 != 0) goto L_0x000e
            return r2
        L_0x000e:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
        L_0x0014:
            if (r0 <= 0) goto L_0x0023
            int r0 = r0 + (-1)
            android.view.View r3 = r4.getChildAt(r0)
            boolean r3 = m2668c(r3)
            if (r3 == 0) goto L_0x0014
            return r1
        L_0x0023:
            return r2
    }

    /* renamed from: d */
    private void m2666d(android.view.ViewGroup r6) {
            r5 = this;
            android.view.View r0 = r5.f1283G
            r1 = 8
            if (r0 == 0) goto L_0x0020
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            android.view.View r2 = r5.f1283G
            r3 = 0
            r6.addView(r2, r3, r0)
            android.view.Window r6 = r5.f1298c
            int r0 = p000a.p001a.C0005f.title_template
            android.view.View r6 = r6.findViewById(r0)
            r6.setVisibility(r1)
            goto L_0x0098
        L_0x0020:
            android.view.Window r0 = r5.f1298c
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.f1280D = r0
            java.lang.CharSequence r0 = r5.f1300e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0085
            boolean r0 = r5.f1292P
            if (r0 == 0) goto L_0x0085
            android.view.Window r6 = r5.f1298c
            int r0 = p000a.p001a.C0005f.alertTitle
            android.view.View r6 = r6.findViewById(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f1281E = r6
            android.widget.TextView r6 = r5.f1281E
            java.lang.CharSequence r0 = r5.f1300e
            r6.setText(r0)
            int r6 = r5.f1278B
            if (r6 == 0) goto L_0x0058
            android.widget.ImageView r0 = r5.f1280D
            r0.setImageResource(r6)
            goto L_0x0098
        L_0x0058:
            android.graphics.drawable.Drawable r6 = r5.f1279C
            if (r6 == 0) goto L_0x0062
            android.widget.ImageView r0 = r5.f1280D
            r0.setImageDrawable(r6)
            goto L_0x0098
        L_0x0062:
            android.widget.TextView r6 = r5.f1281E
            android.widget.ImageView r0 = r5.f1280D
            int r0 = r0.getPaddingLeft()
            android.widget.ImageView r2 = r5.f1280D
            int r2 = r2.getPaddingTop()
            android.widget.ImageView r3 = r5.f1280D
            int r3 = r3.getPaddingRight()
            android.widget.ImageView r4 = r5.f1280D
            int r4 = r4.getPaddingBottom()
            r6.setPadding(r0, r2, r3, r4)
            android.widget.ImageView r6 = r5.f1280D
            r6.setVisibility(r1)
            goto L_0x0098
        L_0x0085:
            android.view.Window r0 = r5.f1298c
            int r2 = p000a.p001a.C0005f.title_template
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r5.f1280D
            r0.setVisibility(r1)
            r6.setVisibility(r1)
        L_0x0098:
            return
    }

    /* renamed from: a */
    public int m2689a(int r4) {
            r3 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r3.f1296a
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            r1.resolveAttribute(r4, r0, r2)
            int r4 = r0.resourceId
            return r4
    }

    /* renamed from: a */
    public void m2690a() {
            r2 = this;
            int r0 = r2.m2676b()
            androidx.appcompat.app.i r1 = r2.f1297b
            r1.setContentView(r0)
            r2.m2670c()
            return
    }

    /* renamed from: a */
    public void m2687a(int r1, java.lang.CharSequence r2, android.content.DialogInterface.OnClickListener r3, android.os.Message r4, android.graphics.drawable.Drawable r5) {
            r0 = this;
            if (r4 != 0) goto L_0x000a
            if (r3 == 0) goto L_0x000a
            android.os.Handler r4 = r0.f1294R
            android.os.Message r4 = r4.obtainMessage(r1, r3)
        L_0x000a:
            r3 = -3
            if (r1 == r3) goto L_0x0029
            r3 = -2
            if (r1 == r3) goto L_0x0022
            r3 = -1
            if (r1 != r3) goto L_0x001a
            r0.f1311p = r2
            r0.f1312q = r4
            r0.f1313r = r5
            goto L_0x002f
        L_0x001a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Button does not exist"
            r1.<init>(r2)
            throw r1
        L_0x0022:
            r0.f1315t = r2
            r0.f1316u = r4
            r0.f1317v = r5
            goto L_0x002f
        L_0x0029:
            r0.f1319x = r2
            r0.f1320y = r4
            r0.f1321z = r5
        L_0x002f:
            return
    }

    /* renamed from: a */
    public void m2685a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            r2.f1279C = r3
            r0 = 0
            r2.f1278B = r0
            android.widget.ImageView r1 = r2.f1280D
            if (r1 == 0) goto L_0x0019
            if (r3 == 0) goto L_0x0014
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r2.f1280D
            r0.setImageDrawable(r3)
            goto L_0x0019
        L_0x0014:
            r3 = 8
            r1.setVisibility(r3)
        L_0x0019:
            return
    }

    /* renamed from: a */
    public void m2684a(android.view.View r1) {
            r0 = this;
            r0.f1283G = r1
            return
    }

    /* renamed from: a */
    public void m2683a(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.f1303h = r1
            r1 = 0
            r0.f1304i = r1
            r1 = 1
            r0.f1309n = r1
            r0.f1305j = r2
            r0.f1306k = r3
            r0.f1307l = r4
            r0.f1308m = r5
            return
    }

    /* renamed from: a */
    public void m2677a(java.lang.CharSequence r2) {
            r1 = this;
            r1.f1301f = r2
            android.widget.TextView r0 = r1.f1282F
            if (r0 == 0) goto L_0x0009
            r0.setText(r2)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public boolean m2688a(int r1, android.view.KeyEvent r2) {
            r0 = this;
            androidx.core.widget.NestedScrollView r1 = r0.f1277A
            if (r1 == 0) goto L_0x000c
            boolean r1 = r1.m1574a(r2)
            if (r1 == 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
    }

    /* renamed from: b */
    public void m2675b(int r2) {
            r1 = this;
            r0 = 0
            r1.f1279C = r0
            r1.f1278B = r2
            android.widget.ImageView r0 = r1.f1280D
            if (r0 == 0) goto L_0x001c
            if (r2 == 0) goto L_0x0017
            r2 = 0
            r0.setVisibility(r2)
            android.widget.ImageView r2 = r1.f1280D
            int r0 = r1.f1278B
            r2.setImageResource(r0)
            goto L_0x001c
        L_0x0017:
            r2 = 8
            r0.setVisibility(r2)
        L_0x001c:
            return
    }

    /* renamed from: b */
    public void m2673b(android.view.View r1) {
            r0 = this;
            r0.f1303h = r1
            r1 = 0
            r0.f1304i = r1
            r0.f1309n = r1
            return
    }

    /* renamed from: b */
    public void m2671b(java.lang.CharSequence r2) {
            r1 = this;
            r1.f1300e = r2
            android.widget.TextView r0 = r1.f1281E
            if (r0 == 0) goto L_0x0009
            r0.setText(r2)
        L_0x0009:
            return
    }

    /* renamed from: b */
    public boolean m2674b(int r1, android.view.KeyEvent r2) {
            r0 = this;
            androidx.core.widget.NestedScrollView r1 = r0.f1277A
            if (r1 == 0) goto L_0x000c
            boolean r1 = r1.m1574a(r2)
            if (r1 == 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
    }

    /* renamed from: c */
    public void m2669c(int r2) {
            r1 = this;
            r0 = 0
            r1.f1303h = r0
            r1.f1304i = r2
            r2 = 0
            r1.f1309n = r2
            return
    }
}
