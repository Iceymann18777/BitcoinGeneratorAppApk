package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public class C0496h implements p000a.p018g.p022f.p023a.AbstractMenuC0155a {

    /* renamed from: A */
    private static final int[] f1702A = null;

    /* renamed from: a */
    private final android.content.Context f1703a;

    /* renamed from: b */
    private final android.content.res.Resources f1704b;

    /* renamed from: c */
    private boolean f1705c;

    /* renamed from: d */
    private boolean f1706d;

    /* renamed from: e */
    private androidx.appcompat.view.menu.C0496h.AbstractC0497a f1707e;

    /* renamed from: f */
    private java.util.ArrayList<androidx.appcompat.view.menu.C0501k> f1708f;

    /* renamed from: g */
    private java.util.ArrayList<androidx.appcompat.view.menu.C0501k> f1709g;

    /* renamed from: h */
    private boolean f1710h;

    /* renamed from: i */
    private java.util.ArrayList<androidx.appcompat.view.menu.C0501k> f1711i;

    /* renamed from: j */
    private java.util.ArrayList<androidx.appcompat.view.menu.C0501k> f1712j;

    /* renamed from: k */
    private boolean f1713k;

    /* renamed from: l */
    private int f1714l;

    /* renamed from: m */
    private android.view.ContextMenu.ContextMenuInfo f1715m;

    /* renamed from: n */
    java.lang.CharSequence f1716n;

    /* renamed from: o */
    android.graphics.drawable.Drawable f1717o;

    /* renamed from: p */
    android.view.View f1718p;

    /* renamed from: q */
    private boolean f1719q;

    /* renamed from: r */
    private boolean f1720r;

    /* renamed from: s */
    private boolean f1721s;

    /* renamed from: t */
    private boolean f1722t;

    /* renamed from: u */
    private boolean f1723u;

    /* renamed from: v */
    private java.util.ArrayList<androidx.appcompat.view.menu.C0501k> f1724v;

    /* renamed from: w */
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.AbstractC0513p>> f1725w;

    /* renamed from: x */
    private androidx.appcompat.view.menu.C0501k f1726x;

    /* renamed from: y */
    private boolean f1727y;

    /* renamed from: z */
    private boolean f1728z;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    /* loaded from: classes.dex */
    public interface AbstractC0497a {
        /* renamed from: a */
        void mo65a(androidx.appcompat.view.menu.C0496h r1);

        /* renamed from: a */
        boolean mo64a(androidx.appcompat.view.menu.C0496h r1, android.view.MenuItem r2);
    }

    /* renamed from: androidx.appcompat.view.menu.h$b */
    /* loaded from: classes.dex */
    public interface AbstractC0498b {
        /* renamed from: a */
        boolean mo2265a(androidx.appcompat.view.menu.C0501k r1);
    }

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA  , data: [1, 4, 5, 3, 2, 0} // fill-array
            androidx.appcompat.view.menu.C0496h.f1702A = r0
            return
    }

    public C0496h(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1714l = r0
            r2.f1719q = r0
            r2.f1720r = r0
            r2.f1721s = r0
            r2.f1722t = r0
            r2.f1723u = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f1724v = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r2.f1725w = r1
            r2.f1727y = r0
            r2.f1703a = r3
            android.content.res.Resources r3 = r3.getResources()
            r2.f1704b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1708f = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1709g = r3
            r3 = 1
            r2.f1710h = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1711i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1712j = r0
            r2.f1713k = r3
            r2.m2385e(r3)
            return
    }

    /* renamed from: a */
    private static int m2404a(java.util.ArrayList<androidx.appcompat.view.menu.C0501k> r2, int r3) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L_0x0006:
            if (r0 < 0) goto L_0x001a
            java.lang.Object r1 = r2.get(r0)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.C0501k) r1
            int r1 = r1.m2360c()
            if (r1 > r3) goto L_0x0017
            int r0 = r0 + 1
            return r0
        L_0x0017:
            int r0 = r0 + (-1)
            goto L_0x0006
        L_0x001a:
            r2 = 0
            return r2
    }

    /* renamed from: a */
    private androidx.appcompat.view.menu.C0501k m2419a(int r10, int r11, int r12, int r13, java.lang.CharSequence r14, int r15) {
            r9 = this;
            androidx.appcompat.view.menu.k r8 = new androidx.appcompat.view.menu.k
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    /* renamed from: a */
    private void m2416a(int r3, java.lang.CharSequence r4, int r5, android.graphics.drawable.Drawable r6, android.view.View r7) {
            r2 = this;
            android.content.res.Resources r0 = r2.m2376l()
            r1 = 0
            if (r7 == 0) goto L_0x000e
            r2.f1718p = r7
            r2.f1716n = r1
            r2.f1717o = r1
            goto L_0x002e
        L_0x000e:
            if (r3 <= 0) goto L_0x0017
            java.lang.CharSequence r3 = r0.getText(r3)
            r2.f1716n = r3
            goto L_0x001b
        L_0x0017:
            if (r4 == 0) goto L_0x001b
            r2.f1716n = r4
        L_0x001b:
            if (r5 <= 0) goto L_0x0028
            android.content.Context r3 = r2.m2388e()
            android.graphics.drawable.Drawable r3 = p000a.p018g.p019d.C0124a.m3732b(r3, r5)
            r2.f1717o = r3
            goto L_0x002c
        L_0x0028:
            if (r6 == 0) goto L_0x002c
            r2.f1717o = r6
        L_0x002c:
            r2.f1718p = r1
        L_0x002e:
            r3 = 0
            r2.mo87b(r3)
            return
    }

    /* renamed from: a */
    private void m2415a(int r2, boolean r3) {
            r1 = this;
            if (r2 < 0) goto L_0x0016
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r1.f1708f
            int r0 = r0.size()
            if (r2 < r0) goto L_0x000b
            goto L_0x0016
        L_0x000b:
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r1.f1708f
            r0.remove(r2)
            if (r3 == 0) goto L_0x0016
            r2 = 1
            r1.mo87b(r2)
        L_0x0016:
            return
    }

    /* renamed from: a */
    private boolean m2406a(androidx.appcompat.view.menu.SubMenuC0523v r4, androidx.appcompat.view.menu.AbstractC0513p r5) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r3.f1725w
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            if (r5 == 0) goto L_0x0010
            boolean r1 = r5.mo124a(r4)
        L_0x0010:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r5 = r3.f1725w
            java.util.Iterator r5 = r5.iterator()
        L_0x0016:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r5.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r2 = r0.get()
            androidx.appcompat.view.menu.p r2 = (androidx.appcompat.view.menu.AbstractC0513p) r2
            if (r2 != 0) goto L_0x0030
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r2 = r3.f1725w
            r2.remove(r0)
            goto L_0x0016
        L_0x0030:
            if (r1 != 0) goto L_0x0016
            boolean r0 = r2.mo124a(r4)
            r1 = r0
            goto L_0x0016
        L_0x0038:
            return r1
    }

    /* renamed from: d */
    private void m2389d(boolean r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r3.f1725w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            r3.m2373s()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r3.f1725w
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.p r2 = (androidx.appcompat.view.menu.AbstractC0513p) r2
            if (r2 != 0) goto L_0x002c
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r2 = r3.f1725w
            r2.remove(r1)
            goto L_0x0012
        L_0x002c:
            r2.mo123a(r4)
            goto L_0x0012
        L_0x0030:
            r3.m2374r()
            return
    }

    /* renamed from: e */
    private void m2386e(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "android:menu:presenters"
            android.util.SparseArray r4 = r4.getSparseParcelableArray(r0)
            if (r4 == 0) goto L_0x0043
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r3.f1725w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0011
            goto L_0x0043
        L_0x0011:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r3.f1725w
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0043
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.p r2 = (androidx.appcompat.view.menu.AbstractC0513p) r2
            if (r2 != 0) goto L_0x0031
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r2 = r3.f1725w
            r2.remove(r1)
            goto L_0x0017
        L_0x0031:
            int r1 = r2.mo136a()
            if (r1 <= 0) goto L_0x0017
            java.lang.Object r1 = r4.get(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            if (r1 == 0) goto L_0x0017
            r2.mo130a(r1)
            goto L_0x0017
        L_0x0043:
            return
    }

    /* renamed from: e */
    private void m2385e(boolean r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f1704b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f1703a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1703a
            boolean r3 = p000a.p018g.p029l.C0220s.m3382d(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f1706d = r0
            return
    }

    /* renamed from: f */
    private static int m2383f(int r3) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r3
            int r0 = r0 >> 16
            if (r0 < 0) goto L_0x0016
            int[] r1 = androidx.appcompat.view.menu.C0496h.f1702A
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0016
            r0 = r1[r0]
            int r0 = r0 << 16
            r1 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r1
            r3 = r3 | r0
            return r3
        L_0x0016:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "order does not contain a valid category."
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: f */
    private void m2382f(android.os.Bundle r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r4.f1725w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r1 = r4.f1725w
            java.util.Iterator r1 = r1.iterator()
        L_0x0014:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.p r3 = (androidx.appcompat.view.menu.AbstractC0513p) r3
            if (r3 != 0) goto L_0x002e
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r3 = r4.f1725w
            r3.remove(r2)
            goto L_0x0014
        L_0x002e:
            int r2 = r3.mo136a()
            if (r2 <= 0) goto L_0x0014
            android.os.Parcelable r3 = r3.mo117c()
            if (r3 == 0) goto L_0x0014
            r0.put(r2, r3)
            goto L_0x0014
        L_0x003e:
            java.lang.String r1 = "android:menu:presenters"
            r5.putSparseParcelableArray(r1, r0)
            return
    }

    /* renamed from: a */
    public int m2421a(int r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.m2420a(r2, r0)
            return r2
    }

    /* renamed from: a */
    public int m2420a(int r3, int r4) {
            r2 = this;
            int r0 = r2.size()
            if (r4 >= 0) goto L_0x0007
            r4 = 0
        L_0x0007:
            if (r4 >= r0) goto L_0x001b
            java.util.ArrayList<androidx.appcompat.view.menu.k> r1 = r2.f1708f
            java.lang.Object r1 = r1.get(r4)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.C0501k) r1
            int r1 = r1.getGroupId()
            if (r1 != r3) goto L_0x0018
            return r4
        L_0x0018:
            int r4 = r4 + 1
            goto L_0x0007
        L_0x001b:
            r3 = -1
            return r3
    }

    /* renamed from: a */
    protected android.view.MenuItem m2418a(int r9, int r10, int r11, java.lang.CharSequence r12) {
            r8 = this;
            int r7 = m2383f(r11)
            int r6 = r8.f1714l
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r7
            r5 = r12
            androidx.appcompat.view.menu.k r9 = r0.m2419a(r1, r2, r3, r4, r5, r6)
            android.view.ContextMenu$ContextMenuInfo r10 = r8.f1715m
            if (r10 == 0) goto L_0x0017
            r9.m2367a(r10)
        L_0x0017:
            java.util.ArrayList<androidx.appcompat.view.menu.k> r10 = r8.f1708f
            int r11 = m2404a(r10, r7)
            r10.add(r11, r9)
            r10 = 1
            r8.mo87b(r10)
            return r9
    }

    /* renamed from: a */
    protected androidx.appcompat.view.menu.C0496h m2414a(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r6
            r4 = r7
            r0.m2416a(r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: a */
    protected androidx.appcompat.view.menu.C0496h m2409a(android.view.View r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r6
            r5 = r7
            r0.m2416a(r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: a */
    protected androidx.appcompat.view.menu.C0496h m2405a(java.lang.CharSequence r7) {
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.m2416a(r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: a */
    androidx.appcompat.view.menu.C0501k m2417a(int r12, android.view.KeyEvent r13) {
            r11 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r11.f1724v
            r0.clear()
            r11.m2403a(r0, r12, r13)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0010
            return r2
        L_0x0010:
            int r1 = r13.getMetaState()
            android.view.KeyCharacterMap$KeyData r3 = new android.view.KeyCharacterMap$KeyData
            r3.<init>()
            r13.getKeyData(r3)
            int r13 = r0.size()
            r4 = 1
            r5 = 0
            if (r13 != r4) goto L_0x002b
            java.lang.Object r12 = r0.get(r5)
            androidx.appcompat.view.menu.k r12 = (androidx.appcompat.view.menu.C0501k) r12
            return r12
        L_0x002b:
            boolean r4 = r11.mo2295p()
            r6 = 0
        L_0x0030:
            if (r6 >= r13) goto L_0x0066
            java.lang.Object r7 = r0.get(r6)
            androidx.appcompat.view.menu.k r7 = (androidx.appcompat.view.menu.C0501k) r7
            if (r4 == 0) goto L_0x003f
            char r8 = r7.getAlphabeticShortcut()
            goto L_0x0043
        L_0x003f:
            char r8 = r7.getNumericShortcut()
        L_0x0043:
            char[] r9 = r3.meta
            char r9 = r9[r5]
            if (r8 != r9) goto L_0x004d
            r9 = r1 & 2
            if (r9 == 0) goto L_0x0062
        L_0x004d:
            char[] r9 = r3.meta
            r10 = 2
            char r9 = r9[r10]
            if (r8 != r9) goto L_0x0058
            r9 = r1 & 2
            if (r9 != 0) goto L_0x0062
        L_0x0058:
            if (r4 == 0) goto L_0x0063
            r9 = 8
            if (r8 != r9) goto L_0x0063
            r8 = 67
            if (r12 != r8) goto L_0x0063
        L_0x0062:
            return r7
        L_0x0063:
            int r6 = r6 + 1
            goto L_0x0030
        L_0x0066:
            return r2
    }

    /* renamed from: a */
    public void m2422a() {
            r1 = this;
            androidx.appcompat.view.menu.h$a r0 = r1.f1707e
            if (r0 == 0) goto L_0x0007
            r0.mo65a(r1)
        L_0x0007:
            return
    }

    /* renamed from: a */
    public void m2413a(android.os.Bundle r8) {
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r7.mo2298d()
            android.util.SparseArray r0 = r8.getSparseParcelableArray(r0)
            int r1 = r7.size()
            r2 = 0
        L_0x0010:
            if (r2 >= r1) goto L_0x0038
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L_0x0026
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L_0x0026
            r4.restoreHierarchyState(r0)
        L_0x0026:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L_0x0035
            android.view.SubMenu r3 = r3.getSubMenu()
            androidx.appcompat.view.menu.v r3 = (androidx.appcompat.view.menu.SubMenuC0523v) r3
            r3.m2413a(r8)
        L_0x0035:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0038:
            java.lang.String r0 = "android:menu:expandedactionview"
            int r8 = r8.getInt(r0)
            if (r8 <= 0) goto L_0x0049
            android.view.MenuItem r8 = r7.findItem(r8)
            if (r8 == 0) goto L_0x0049
            r8.expandActionView()
        L_0x0049:
            return
    }

    /* renamed from: a */
    void m2412a(android.view.MenuItem r7) {
            r6 = this;
            int r0 = r7.getGroupId()
            java.util.ArrayList<androidx.appcompat.view.menu.k> r1 = r6.f1708f
            int r1 = r1.size()
            r6.m2373s()
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r1) goto L_0x0038
            java.util.ArrayList<androidx.appcompat.view.menu.k> r4 = r6.f1708f
            java.lang.Object r4 = r4.get(r3)
            androidx.appcompat.view.menu.k r4 = (androidx.appcompat.view.menu.C0501k) r4
            int r5 = r4.getGroupId()
            if (r5 != r0) goto L_0x0035
            boolean r5 = r4.m2351i()
            if (r5 != 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            boolean r5 = r4.isCheckable()
            if (r5 != 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            if (r4 != r7) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            r4.m2361b(r5)
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0038:
            r6.m2374r()
            return
    }

    /* renamed from: a */
    public void mo2302a(androidx.appcompat.view.menu.C0496h.AbstractC0497a r1) {
            r0 = this;
            r0.f1707e = r1
            return
    }

    /* renamed from: a */
    public void m2408a(androidx.appcompat.view.menu.AbstractC0513p r2) {
            r1 = this;
            android.content.Context r0 = r1.f1703a
            r1.m2407a(r2, r0)
            return
    }

    /* renamed from: a */
    public void m2407a(androidx.appcompat.view.menu.AbstractC0513p r3, android.content.Context r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r2.f1725w
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            r3.mo133a(r4, r2)
            r3 = 1
            r2.f1713k = r3
            return
    }

    /* renamed from: a */
    void m2403a(java.util.List<androidx.appcompat.view.menu.C0501k> r13, int r14, android.view.KeyEvent r15) {
            r12 = this;
            boolean r0 = r12.mo2295p()
            int r1 = r15.getModifiers()
            android.view.KeyCharacterMap$KeyData r2 = new android.view.KeyCharacterMap$KeyData
            r2.<init>()
            boolean r3 = r15.getKeyData(r2)
            r4 = 67
            if (r3 != 0) goto L_0x0018
            if (r14 == r4) goto L_0x0018
            return
        L_0x0018:
            java.util.ArrayList<androidx.appcompat.view.menu.k> r3 = r12.f1708f
            int r3 = r3.size()
            r5 = 0
            r6 = 0
        L_0x0020:
            if (r6 >= r3) goto L_0x007d
            java.util.ArrayList<androidx.appcompat.view.menu.k> r7 = r12.f1708f
            java.lang.Object r7 = r7.get(r6)
            androidx.appcompat.view.menu.k r7 = (androidx.appcompat.view.menu.C0501k) r7
            boolean r8 = r7.hasSubMenu()
            if (r8 == 0) goto L_0x0039
            android.view.SubMenu r8 = r7.getSubMenu()
            androidx.appcompat.view.menu.h r8 = (androidx.appcompat.view.menu.C0496h) r8
            r8.m2403a(r13, r14, r15)
        L_0x0039:
            if (r0 == 0) goto L_0x0040
            char r8 = r7.getAlphabeticShortcut()
            goto L_0x0044
        L_0x0040:
            char r8 = r7.getNumericShortcut()
        L_0x0044:
            if (r0 == 0) goto L_0x004b
            int r9 = r7.getAlphabeticModifiers()
            goto L_0x004f
        L_0x004b:
            int r9 = r7.getNumericModifiers()
        L_0x004f:
            r10 = 69647(0x1100f, float:9.7596E-41)
            r11 = r1 & r10
            r9 = r9 & r10
            if (r11 != r9) goto L_0x0059
            r9 = 1
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            if (r9 == 0) goto L_0x007a
            if (r8 == 0) goto L_0x007a
            char[] r9 = r2.meta
            char r10 = r9[r5]
            if (r8 == r10) goto L_0x0071
            r10 = 2
            char r9 = r9[r10]
            if (r8 == r9) goto L_0x0071
            if (r0 == 0) goto L_0x007a
            r9 = 8
            if (r8 != r9) goto L_0x007a
            if (r14 != r4) goto L_0x007a
        L_0x0071:
            boolean r8 = r7.isEnabled()
            if (r8 == 0) goto L_0x007a
            r13.add(r7)
        L_0x007a:
            int r6 = r6 + 1
            goto L_0x0020
        L_0x007d:
            return
    }

    /* renamed from: a */
    public final void m2402a(boolean r4) {
            r3 = this;
            boolean r0 = r3.f1723u
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r3.f1723u = r0
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r3.f1725w
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.p r2 = (androidx.appcompat.view.menu.AbstractC0513p) r2
            if (r2 != 0) goto L_0x0028
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r2 = r3.f1725w
            r2.remove(r1)
            goto L_0x000e
        L_0x0028:
            r2.mo126a(r3, r4)
            goto L_0x000e
        L_0x002c:
            r4 = 0
            r3.f1723u = r4
            return
    }

    /* renamed from: a */
    public boolean m2411a(android.view.MenuItem r2, int r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.m2410a(r2, r0, r3)
            return r2
    }

    /* renamed from: a */
    public boolean m2410a(android.view.MenuItem r7, androidx.appcompat.view.menu.AbstractC0513p r8, int r9) {
            r6 = this;
            androidx.appcompat.view.menu.k r7 = (androidx.appcompat.view.menu.C0501k) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.m2353g()
            a.g.l.b r2 = r7.mo2370a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo2344a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.m2354f()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.m2402a(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.m2402a(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.v r9 = new androidx.appcompat.view.menu.v
            android.content.Context r0 = r6.m2388e()
            r9.<init>(r0, r6, r7)
            r7.m2365a(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.v r7 = (androidx.appcompat.view.menu.SubMenuC0523v) r7
            if (r4 == 0) goto L_0x0063
            r2.mo2343a(r7)
        L_0x0063:
            boolean r7 = r6.m2406a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
    }

    /* renamed from: a */
    boolean mo2301a(androidx.appcompat.view.menu.C0496h r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.view.menu.h$a r0 = r1.f1707e
            if (r0 == 0) goto L_0x000c
            boolean r2 = r0.mo64a(r2, r3)
            if (r2 == 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            return r2
    }

    /* renamed from: a */
    public boolean mo2300a(androidx.appcompat.view.menu.C0501k r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r4.f1725w
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x003f
            androidx.appcompat.view.menu.k r0 = r4.f1726x
            if (r0 == r5) goto L_0x000e
            goto L_0x003f
        L_0x000e:
            r4.m2373s()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r4.f1725w
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.p r3 = (androidx.appcompat.view.menu.AbstractC0513p) r3
            if (r3 != 0) goto L_0x0031
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r3 = r4.f1725w
            r3.remove(r2)
            goto L_0x0017
        L_0x0031:
            boolean r1 = r3.mo119b(r4, r5)
            if (r1 == 0) goto L_0x0017
        L_0x0037:
            r4.m2374r()
            if (r1 == 0) goto L_0x003f
            r5 = 0
            r4.f1726x = r5
        L_0x003f:
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1704b
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.MenuItem r2 = r1.m2418a(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1704b
            java.lang.String r5 = r0.getString(r5)
            android.view.MenuItem r2 = r1.m2418a(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.m2418a(r1, r2, r3, r4)
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.MenuItem r2 = r1.m2418a(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
            r7 = this;
            android.content.Context r0 = r7.f1703a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x0060
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo
            java.lang.String r5 = r5.packageName
            android.content.pm.ActivityInfo r6 = r14.activityInfo
            java.lang.String r6 = r6.name
            r4.<init>(r5, r6)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.add(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            android.view.MenuItem r4 = r4.setIcon(r5)
            android.view.MenuItem r3 = r4.setIntent(r3)
            if (r15 == 0) goto L_0x005d
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x005d
            r15[r14] = r3
        L_0x005d:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0060:
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1704b
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.SubMenu r2 = r1.addSubMenu(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1704b
            java.lang.String r5 = r0.getString(r5)
            android.view.SubMenu r2 = r1.addSubMenu(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.m2418a(r1, r2, r3, r4)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.C0501k) r1
            androidx.appcompat.view.menu.v r2 = new androidx.appcompat.view.menu.v
            android.content.Context r3 = r0.f1703a
            r2.<init>(r3, r0, r1)
            r1.m2365a(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.SubMenu r2 = r1.addSubMenu(r0, r0, r0, r2)
            return r2
    }

    /* renamed from: b */
    public int m2400b(int r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0019
            java.util.ArrayList<androidx.appcompat.view.menu.k> r2 = r3.f1708f
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.k r2 = (androidx.appcompat.view.menu.C0501k) r2
            int r2 = r2.getItemId()
            if (r2 != r4) goto L_0x0016
            return r1
        L_0x0016:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0019:
            r4 = -1
            return r4
    }

    /* renamed from: b */
    public void m2401b() {
            r6 = this;
            java.util.ArrayList r0 = r6.m2375n()
            boolean r1 = r6.f1713k
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r1 = r6.f1725w
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L_0x0011:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0031
            java.lang.Object r4 = r1.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r5 = r4.get()
            androidx.appcompat.view.menu.p r5 = (androidx.appcompat.view.menu.AbstractC0513p) r5
            if (r5 != 0) goto L_0x002b
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r5 = r6.f1725w
            r5.remove(r4)
            goto L_0x0011
        L_0x002b:
            boolean r4 = r5.mo122b()
            r3 = r3 | r4
            goto L_0x0011
        L_0x0031:
            if (r3 == 0) goto L_0x005b
            java.util.ArrayList<androidx.appcompat.view.menu.k> r1 = r6.f1711i
            r1.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.k> r1 = r6.f1712j
            r1.clear()
            int r1 = r0.size()
            r3 = 0
        L_0x0042:
            if (r3 >= r1) goto L_0x006e
            java.lang.Object r4 = r0.get(r3)
            androidx.appcompat.view.menu.k r4 = (androidx.appcompat.view.menu.C0501k) r4
            boolean r5 = r4.m2352h()
            if (r5 == 0) goto L_0x0053
            java.util.ArrayList<androidx.appcompat.view.menu.k> r5 = r6.f1711i
            goto L_0x0055
        L_0x0053:
            java.util.ArrayList<androidx.appcompat.view.menu.k> r5 = r6.f1712j
        L_0x0055:
            r5.add(r4)
            int r3 = r3 + 1
            goto L_0x0042
        L_0x005b:
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r6.f1711i
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r6.f1712j
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r6.f1712j
            java.util.ArrayList r1 = r6.m2375n()
            r0.addAll(r1)
        L_0x006e:
            r6.f1713k = r2
            return
    }

    /* renamed from: b */
    public void m2399b(android.os.Bundle r1) {
            r0 = this;
            r0.m2386e(r1)
            return
    }

    /* renamed from: b */
    public void m2398b(androidx.appcompat.view.menu.AbstractC0513p r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r3.f1725w
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.p r2 = (androidx.appcompat.view.menu.AbstractC0513p) r2
            if (r2 == 0) goto L_0x001c
            if (r2 != r4) goto L_0x0006
        L_0x001c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r2 = r3.f1725w
            r2.remove(r1)
            goto L_0x0006
        L_0x0022:
            return
    }

    /* renamed from: b */
    public void mo87b(boolean r3) {
            r2 = this;
            boolean r0 = r2.f1719q
            r1 = 1
            if (r0 != 0) goto L_0x000f
            if (r3 == 0) goto L_0x000b
            r2.f1710h = r1
            r2.f1713k = r1
        L_0x000b:
            r2.m2389d(r3)
            goto L_0x0015
        L_0x000f:
            r2.f1720r = r1
            if (r3 == 0) goto L_0x0015
            r2.f1721s = r1
        L_0x0015:
            return
    }

    /* renamed from: b */
    public boolean mo2299b(androidx.appcompat.view.menu.C0501k r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r4.f1725w
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            r4.m2373s()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r0 = r4.f1725w
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.p r3 = (androidx.appcompat.view.menu.AbstractC0513p) r3
            if (r3 != 0) goto L_0x002d
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.p>> r3 = r4.f1725w
            r3.remove(r2)
            goto L_0x0013
        L_0x002d:
            boolean r1 = r3.mo127a(r4, r5)
            if (r1 == 0) goto L_0x0013
        L_0x0033:
            r4.m2374r()
            if (r1 == 0) goto L_0x003a
            r4.f1726x = r5
        L_0x003a:
            return r1
    }

    /* renamed from: c */
    public androidx.appcompat.view.menu.C0496h m2396c(int r1) {
            r0 = this;
            r0.f1714l = r1
            return r0
    }

    /* renamed from: c */
    public java.util.ArrayList<androidx.appcompat.view.menu.C0501k> m2397c() {
            r1 = this;
            r1.m2401b()
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r1.f1711i
            return r0
    }

    /* renamed from: c */
    public void m2395c(android.os.Bundle r8) {
            r7 = this;
            int r0 = r7.size()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0044
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L_0x0032
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L_0x0032
            if (r1 != 0) goto L_0x0020
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
        L_0x0020:
            r4.saveHierarchyState(r1)
            boolean r4 = r3.isActionViewExpanded()
            if (r4 == 0) goto L_0x0032
            int r4 = r3.getItemId()
            java.lang.String r5 = "android:menu:expandedactionview"
            r8.putInt(r5, r4)
        L_0x0032:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L_0x0041
            android.view.SubMenu r3 = r3.getSubMenu()
            androidx.appcompat.view.menu.v r3 = (androidx.appcompat.view.menu.SubMenuC0523v) r3
            r3.m2395c(r8)
        L_0x0041:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0044:
            if (r1 == 0) goto L_0x004d
            java.lang.String r0 = r7.mo2298d()
            r8.putSparseParcelableArray(r0, r1)
        L_0x004d:
            return
    }

    /* renamed from: c */
    void m2394c(androidx.appcompat.view.menu.C0501k r1) {
            r0 = this;
            r1 = 1
            r0.f1713k = r1
            r0.mo87b(r1)
            return
    }

    /* renamed from: c */
    public void m2393c(boolean r1) {
            r0 = this;
            r0.f1728z = r1
            return
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f1726x
            if (r0 == 0) goto L_0x0007
            r1.mo2300a(r0)
        L_0x0007:
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r1.f1708f
            r0.clear()
            r0 = 1
            r1.mo87b(r0)
            return
    }

    public void clearHeader() {
            r1 = this;
            r0 = 0
            r1.f1717o = r0
            r1.f1716n = r0
            r1.f1718p = r0
            r0 = 0
            r1.mo87b(r0)
            return
    }

    @Override // android.view.Menu
    public void close() {
            r1 = this;
            r0 = 1
            r1.m2402a(r0)
            return
    }

    /* renamed from: d */
    protected androidx.appcompat.view.menu.C0496h m2392d(int r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r3 = r7
            r0.m2416a(r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: d */
    protected java.lang.String mo2298d() {
            r1 = this;
            java.lang.String r0 = "android:menu:actionviewstates"
            return r0
    }

    /* renamed from: d */
    public void m2391d(android.os.Bundle r1) {
            r0 = this;
            r0.m2382f(r1)
            return
    }

    /* renamed from: d */
    void m2390d(androidx.appcompat.view.menu.C0501k r1) {
            r0 = this;
            r1 = 1
            r0.f1710h = r1
            r0.mo87b(r1)
            return
    }

    /* renamed from: e */
    public android.content.Context m2388e() {
            r1 = this;
            android.content.Context r0 = r1.f1703a
            return r0
    }

    /* renamed from: e */
    protected androidx.appcompat.view.menu.C0496h m2387e(int r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.m2416a(r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: f */
    public androidx.appcompat.view.menu.C0501k m2384f() {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f1726x
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x002a
            java.util.ArrayList<androidx.appcompat.view.menu.k> r2 = r4.f1708f
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.k r2 = (androidx.appcompat.view.menu.C0501k) r2
            int r3 = r2.getItemId()
            if (r3 != r5) goto L_0x0016
            return r2
        L_0x0016:
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L_0x0027
            android.view.SubMenu r2 = r2.getSubMenu()
            android.view.MenuItem r2 = r2.findItem(r5)
            if (r2 == 0) goto L_0x0027
            return r2
        L_0x0027:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x002a:
            r5 = 0
            return r5
    }

    /* renamed from: g */
    public android.graphics.drawable.Drawable m2381g() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1717o
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r1.f1708f
            java.lang.Object r2 = r0.get(r2)
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            return r2
    }

    /* renamed from: h */
    public java.lang.CharSequence m2380h() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1716n
            return r0
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r5 = this;
            boolean r0 = r5.f1728z
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r5.size()
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r0) goto L_0x0020
            java.util.ArrayList<androidx.appcompat.view.menu.k> r4 = r5.f1708f
            java.lang.Object r4 = r4.get(r3)
            androidx.appcompat.view.menu.k r4 = (androidx.appcompat.view.menu.C0501k) r4
            boolean r4 = r4.isVisible()
            if (r4 == 0) goto L_0x001d
            return r1
        L_0x001d:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0020:
            return r2
    }

    /* renamed from: i */
    public android.view.View m2379i() {
            r1 = this;
            android.view.View r0 = r1.f1718p
            return r0
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r1, android.view.KeyEvent r2) {
            r0 = this;
            androidx.appcompat.view.menu.k r1 = r0.m2417a(r1, r2)
            if (r1 == 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            return r1
    }

    /* renamed from: j */
    public java.util.ArrayList<androidx.appcompat.view.menu.C0501k> m2378j() {
            r1 = this;
            r1.m2401b()
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r1.f1712j
            return r0
    }

    /* renamed from: k */
    boolean m2377k() {
            r1 = this;
            boolean r0 = r1.f1722t
            return r0
    }

    /* renamed from: l */
    android.content.res.Resources m2376l() {
            r1 = this;
            android.content.res.Resources r0 = r1.f1704b
            return r0
    }

    /* renamed from: m */
    public androidx.appcompat.view.menu.C0496h mo2297m() {
            r0 = this;
            return r0
    }

    /* renamed from: n */
    public java.util.ArrayList<androidx.appcompat.view.menu.C0501k> m2375n() {
            r5 = this;
            boolean r0 = r5.f1710h
            if (r0 != 0) goto L_0x0007
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r5.f1709g
            return r0
        L_0x0007:
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r5.f1709g
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r5.f1708f
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0014:
            if (r2 >= r0) goto L_0x002c
            java.util.ArrayList<androidx.appcompat.view.menu.k> r3 = r5.f1708f
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.k r3 = (androidx.appcompat.view.menu.C0501k) r3
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L_0x0029
            java.util.ArrayList<androidx.appcompat.view.menu.k> r4 = r5.f1709g
            r4.add(r3)
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x002c:
            r5.f1710h = r1
            r0 = 1
            r5.f1713k = r0
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r5.f1709g
            return r0
    }

    /* renamed from: o */
    public boolean mo2296o() {
            r1 = this;
            boolean r0 = r1.f1727y
            return r0
    }

    /* renamed from: p */
    boolean mo2295p() {
            r1 = this;
            boolean r0 = r1.f1705c
            return r0
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r1, int r2) {
            r0 = this;
            android.view.MenuItem r1 = r0.findItem(r1)
            boolean r1 = r0.m2411a(r1, r2)
            return r1
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r1, android.view.KeyEvent r2, int r3) {
            r0 = this;
            androidx.appcompat.view.menu.k r1 = r0.m2417a(r1, r2)
            if (r1 == 0) goto L_0x000b
            boolean r1 = r0.m2411a(r1, r3)
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r2 = r3 & 2
            if (r2 == 0) goto L_0x0014
            r2 = 1
            r0.m2402a(r2)
        L_0x0014:
            return r1
    }

    /* renamed from: q */
    public boolean mo2294q() {
            r1 = this;
            boolean r0 = r1.f1706d
            return r0
    }

    /* renamed from: r */
    public void m2374r() {
            r2 = this;
            r0 = 0
            r2.f1719q = r0
            boolean r1 = r2.f1720r
            if (r1 == 0) goto L_0x000e
            r2.f1720r = r0
            boolean r0 = r2.f1721s
            r2.mo87b(r0)
        L_0x000e:
            return
    }

    @Override // android.view.Menu
    public void removeGroup(int r6) {
            r5 = this;
            int r0 = r5.m2421a(r6)
            if (r0 < 0) goto L_0x002a
            java.util.ArrayList<androidx.appcompat.view.menu.k> r1 = r5.f1708f
            int r1 = r1.size()
            int r1 = r1 - r0
            r2 = 0
            r3 = 0
        L_0x000f:
            int r4 = r3 + 1
            if (r3 >= r1) goto L_0x0026
            java.util.ArrayList<androidx.appcompat.view.menu.k> r3 = r5.f1708f
            java.lang.Object r3 = r3.get(r0)
            androidx.appcompat.view.menu.k r3 = (androidx.appcompat.view.menu.C0501k) r3
            int r3 = r3.getGroupId()
            if (r3 != r6) goto L_0x0026
            r5.m2415a(r0, r2)
            r3 = r4
            goto L_0x000f
        L_0x0026:
            r6 = 1
            r5.mo87b(r6)
        L_0x002a:
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
            r1 = this;
            int r2 = r1.m2400b(r2)
            r0 = 1
            r1.m2415a(r2, r0)
            return
    }

    /* renamed from: s */
    public void m2373s() {
            r1 = this;
            boolean r0 = r1.f1719q
            if (r0 != 0) goto L_0x000c
            r0 = 1
            r1.f1719q = r0
            r0 = 0
            r1.f1720r = r0
            r1.f1721s = r0
        L_0x000c:
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r5, boolean r6, boolean r7) {
            r4 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r4.f1708f
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0020
            java.util.ArrayList<androidx.appcompat.view.menu.k> r2 = r4.f1708f
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.k r2 = (androidx.appcompat.view.menu.C0501k) r2
            int r3 = r2.getGroupId()
            if (r3 != r5) goto L_0x001d
            r2.m2359c(r7)
            r2.setCheckable(r6)
        L_0x001d:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0020:
            return
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            r0.f1727y = r1
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r5, boolean r6) {
            r4 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r4.f1708f
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x001d
            java.util.ArrayList<androidx.appcompat.view.menu.k> r2 = r4.f1708f
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.k r2 = (androidx.appcompat.view.menu.C0501k) r2
            int r3 = r2.getGroupId()
            if (r3 != r5) goto L_0x001a
            r2.setEnabled(r6)
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x001d:
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r7, boolean r8) {
            r6 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r6.f1708f
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            r3 = 1
            if (r1 >= r0) goto L_0x0023
            java.util.ArrayList<androidx.appcompat.view.menu.k> r4 = r6.f1708f
            java.lang.Object r4 = r4.get(r1)
            androidx.appcompat.view.menu.k r4 = (androidx.appcompat.view.menu.C0501k) r4
            int r5 = r4.getGroupId()
            if (r5 != r7) goto L_0x0020
            boolean r4 = r4.m2355e(r8)
            if (r4 == 0) goto L_0x0020
            r2 = 1
        L_0x0020:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x0023:
            if (r2 == 0) goto L_0x0028
            r6.mo87b(r3)
        L_0x0028:
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
            r0 = this;
            r0.f1705c = r1
            r1 = 0
            r0.mo87b(r1)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.k> r0 = r1.f1708f
            int r0 = r0.size()
            return r0
    }
}
