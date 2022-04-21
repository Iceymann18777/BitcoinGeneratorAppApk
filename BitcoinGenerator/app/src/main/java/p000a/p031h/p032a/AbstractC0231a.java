package p000a.p031h.p032a;

/* renamed from: a.h.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0231a extends android.widget.BaseAdapter implements android.widget.Filterable, p000a.p031h.p032a.C0234b.AbstractC0235a {

    /* renamed from: b */
    protected boolean f686b;

    /* renamed from: c */
    protected boolean f687c;

    /* renamed from: d */
    protected android.database.Cursor f688d;

    /* renamed from: e */
    protected android.content.Context f689e;

    /* renamed from: f */
    protected int f690f;

    /* renamed from: g */
    protected p000a.p031h.p032a.AbstractC0231a.C0232a f691g;

    /* renamed from: h */
    protected android.database.DataSetObserver f692h;

    /* renamed from: i */
    protected p000a.p031h.p032a.C0234b f693i;

    /* renamed from: a.h.a.a$a */
    /* loaded from: classes.dex */
    private class C0232a extends android.database.ContentObserver {

        /* renamed from: a */
        final /* synthetic */ p000a.p031h.p032a.AbstractC0231a f694a;

        C0232a(p000a.p031h.p032a.AbstractC0231a r1) {
                r0 = this;
                r0.f694a = r1
                android.os.Handler r1 = new android.os.Handler
                r1.<init>()
                r0.<init>(r1)
                return
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r1) {
                r0 = this;
                a.h.a.a r1 = r0.f694a
                r1.m3351b()
                return
        }
    }

    /* renamed from: a.h.a.a$b */
    /* loaded from: classes.dex */
    private class C0233b extends android.database.DataSetObserver {

        /* renamed from: a */
        final /* synthetic */ p000a.p031h.p032a.AbstractC0231a f695a;

        C0233b(p000a.p031h.p032a.AbstractC0231a r1) {
                r0 = this;
                r0.f695a = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r2 = this;
                a.h.a.a r0 = r2.f695a
                r1 = 1
                r0.f686b = r1
                r0.notifyDataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r2 = this;
                a.h.a.a r0 = r2.f695a
                r1 = 0
                r0.f686b = r1
                r0.notifyDataSetInvalidated()
                return
        }
    }

    public AbstractC0231a(android.content.Context r1, android.database.Cursor r2, boolean r3) {
            r0 = this;
            r0.<init>()
            if (r3 == 0) goto L_0x0007
            r3 = 1
            goto L_0x0008
        L_0x0007:
            r3 = 2
        L_0x0008:
            r0.m3352a(r1, r2, r3)
            return
    }

    @Override // p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: a */
    public android.database.Cursor mo3349a() {
            r1 = this;
            android.database.Cursor r0 = r1.f688d
            return r0
    }

    /* renamed from: a */
    public abstract android.view.View mo3348a(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3);

    @Override // p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: a */
    public abstract java.lang.CharSequence mo1942a(android.database.Cursor r1);

    /* renamed from: a */
    void m3352a(android.content.Context r4, android.database.Cursor r5, int r6) {
            r3 = this;
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000b
            r6 = r6 | 2
            r3.f687c = r2
            goto L_0x000d
        L_0x000b:
            r3.f687c = r1
        L_0x000d:
            if (r5 == 0) goto L_0x0010
            r1 = 1
        L_0x0010:
            r3.f688d = r5
            r3.f686b = r1
            r3.f689e = r4
            if (r1 == 0) goto L_0x001f
            java.lang.String r4 = "_id"
            int r4 = r5.getColumnIndexOrThrow(r4)
            goto L_0x0020
        L_0x001f:
            r4 = -1
        L_0x0020:
            r3.f690f = r4
            r4 = 2
            r6 = r6 & r4
            if (r6 != r4) goto L_0x0033
            a.h.a.a$a r4 = new a.h.a.a$a
            r4.<init>(r3)
            r3.f691g = r4
            a.h.a.a$b r4 = new a.h.a.a$b
            r4.<init>(r3)
            goto L_0x0036
        L_0x0033:
            r4 = 0
            r3.f691g = r4
        L_0x0036:
            r3.f692h = r4
            if (r1 == 0) goto L_0x0048
            a.h.a.a$a r4 = r3.f691g
            if (r4 == 0) goto L_0x0041
            r5.registerContentObserver(r4)
        L_0x0041:
            android.database.DataSetObserver r4 = r3.f692h
            if (r4 == 0) goto L_0x0048
            r5.registerDataSetObserver(r4)
        L_0x0048:
            return
    }

    /* renamed from: a */
    public abstract void mo1938a(android.view.View r1, android.content.Context r2, android.database.Cursor r3);

    /* renamed from: b */
    public abstract android.view.View mo1931b(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3);

    /* renamed from: b */
    protected void m3351b() {
            r1 = this;
            boolean r0 = r1.f687c
            if (r0 == 0) goto L_0x0016
            android.database.Cursor r0 = r1.f688d
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L_0x0016
            android.database.Cursor r0 = r1.f688d
            boolean r0 = r0.requery()
            r1.f686b = r0
        L_0x0016:
            return
    }

    @Override // p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: b */
    public void mo1930b(android.database.Cursor r1) {
            r0 = this;
            android.database.Cursor r1 = r0.m3350c(r1)
            if (r1 == 0) goto L_0x0009
            r1.close()
        L_0x0009:
            return
    }

    /* renamed from: c */
    public android.database.Cursor m3350c(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.f688d
            if (r3 != r0) goto L_0x0006
            r3 = 0
            return r3
        L_0x0006:
            if (r0 == 0) goto L_0x0016
            a.h.a.a$a r1 = r2.f691g
            if (r1 == 0) goto L_0x000f
            r0.unregisterContentObserver(r1)
        L_0x000f:
            android.database.DataSetObserver r1 = r2.f692h
            if (r1 == 0) goto L_0x0016
            r0.unregisterDataSetObserver(r1)
        L_0x0016:
            r2.f688d = r3
            if (r3 == 0) goto L_0x0037
            a.h.a.a$a r1 = r2.f691g
            if (r1 == 0) goto L_0x0021
            r3.registerContentObserver(r1)
        L_0x0021:
            android.database.DataSetObserver r1 = r2.f692h
            if (r1 == 0) goto L_0x0028
            r3.registerDataSetObserver(r1)
        L_0x0028:
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.f690f = r3
            r3 = 1
            r2.f686b = r3
            r2.notifyDataSetChanged()
            goto L_0x0040
        L_0x0037:
            r3 = -1
            r2.f690f = r3
            r3 = 0
            r2.f686b = r3
            r2.notifyDataSetInvalidated()
        L_0x0040:
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            boolean r0 = r1.f686b
            if (r0 == 0) goto L_0x000d
            android.database.Cursor r0 = r1.f688d
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getCount()
            return r0
        L_0x000d:
            r0 = 0
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.f686b
            if (r0 == 0) goto L_0x001b
            android.database.Cursor r0 = r1.f688d
            r0.moveToPosition(r2)
            if (r3 != 0) goto L_0x0013
            android.content.Context r2 = r1.f689e
            android.database.Cursor r3 = r1.f688d
            android.view.View r3 = r1.mo3348a(r2, r3, r4)
        L_0x0013:
            android.content.Context r2 = r1.f689e
            android.database.Cursor r4 = r1.f688d
            r1.mo1938a(r3, r2, r4)
            return r3
        L_0x001b:
            r2 = 0
            return r2
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
            r1 = this;
            a.h.a.b r0 = r1.f693i
            if (r0 != 0) goto L_0x000b
            a.h.a.b r0 = new a.h.a.b
            r0.<init>(r1)
            r1.f693i = r0
        L_0x000b:
            a.h.a.b r0 = r1.f693i
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.f686b
            if (r0 == 0) goto L_0x000e
            android.database.Cursor r0 = r1.f688d
            if (r0 == 0) goto L_0x000e
            r0.moveToPosition(r2)
            android.database.Cursor r2 = r1.f688d
            return r2
        L_0x000e:
            r2 = 0
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.f686b
            r1 = 0
            if (r0 == 0) goto L_0x0019
            android.database.Cursor r0 = r3.f688d
            if (r0 == 0) goto L_0x0019
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L_0x0019
            android.database.Cursor r4 = r3.f688d
            int r0 = r3.f690f
            long r0 = r4.getLong(r0)
            return r0
        L_0x0019:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.f686b
            if (r0 == 0) goto L_0x0035
            android.database.Cursor r0 = r1.f688d
            boolean r0 = r0.moveToPosition(r2)
            if (r0 == 0) goto L_0x001e
            if (r3 != 0) goto L_0x0016
            android.content.Context r2 = r1.f689e
            android.database.Cursor r3 = r1.f688d
            android.view.View r3 = r1.mo1931b(r2, r3, r4)
        L_0x0016:
            android.content.Context r2 = r1.f689e
            android.database.Cursor r4 = r1.f688d
            r1.mo1938a(r3, r2, r4)
            return r3
        L_0x001e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "couldn't move cursor to position "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L_0x0035:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "this should only be called when the cursor is valid"
            r2.<init>(r3)
            throw r2
    }
}
