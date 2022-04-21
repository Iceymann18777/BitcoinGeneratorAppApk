package p000a.p031h.p032a;

/* renamed from: a.h.a.b */
/* loaded from: classes.dex */
class C0234b extends android.widget.Filter {

    /* renamed from: a */
    p000a.p031h.p032a.C0234b.AbstractC0235a f696a;

    /* renamed from: a.h.a.b$a */
    /* loaded from: classes.dex */
    interface AbstractC0235a {
        /* renamed from: a */
        android.database.Cursor mo3349a();

        /* renamed from: a */
        android.database.Cursor mo1935a(java.lang.CharSequence r1);

        /* renamed from: a */
        java.lang.CharSequence mo1942a(android.database.Cursor r1);

        /* renamed from: b */
        void mo1930b(android.database.Cursor r1);
    }

    C0234b(p000a.p031h.p032a.C0234b.AbstractC0235a r1) {
            r0 = this;
            r0.<init>()
            r0.f696a = r1
            return
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object r2) {
            r1 = this;
            a.h.a.b$a r0 = r1.f696a
            android.database.Cursor r2 = (android.database.Cursor) r2
            java.lang.CharSequence r2 = r0.mo1942a(r2)
            return r2
    }

    @Override // android.widget.Filter
    protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r3) {
            r2 = this;
            a.h.a.b$a r0 = r2.f696a
            android.database.Cursor r3 = r0.mo1935a(r3)
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r3 == 0) goto L_0x0014
            int r1 = r3.getCount()
            r0.count = r1
            goto L_0x0018
        L_0x0014:
            r3 = 0
            r0.count = r3
            r3 = 0
        L_0x0018:
            r0.values = r3
            return r0
    }

    @Override // android.widget.Filter
    protected void publishResults(java.lang.CharSequence r1, android.widget.Filter.FilterResults r2) {
            r0 = this;
            a.h.a.b$a r1 = r0.f696a
            android.database.Cursor r1 = r1.mo3349a()
            java.lang.Object r2 = r2.values
            if (r2 == 0) goto L_0x0013
            if (r2 == r1) goto L_0x0013
            a.h.a.b$a r1 = r0.f696a
            android.database.Cursor r2 = (android.database.Cursor) r2
            r1.mo1930b(r2)
        L_0x0013:
            return
    }
}
