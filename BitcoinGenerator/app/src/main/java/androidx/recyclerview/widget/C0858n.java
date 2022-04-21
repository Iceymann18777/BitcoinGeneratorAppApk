package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
class C0858n {

    /* renamed from: a */
    final androidx.recyclerview.widget.C0858n.AbstractC0860b f3259a;

    /* renamed from: b */
    androidx.recyclerview.widget.C0858n.C0859a f3260b;

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* loaded from: classes.dex */
    static class C0859a {

        /* renamed from: a */
        int f3261a;

        /* renamed from: b */
        int f3262b;

        /* renamed from: c */
        int f3263c;

        /* renamed from: d */
        int f3264d;

        /* renamed from: e */
        int f3265e;

        C0859a() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f3261a = r0
                return
        }

        /* renamed from: a */
        int m546a(int r1, int r2) {
                r0 = this;
                if (r1 <= r2) goto L_0x0004
                r1 = 1
                return r1
            L_0x0004:
                if (r1 != r2) goto L_0x0008
                r1 = 2
                return r1
            L_0x0008:
                r1 = 4
                return r1
        }

        /* renamed from: a */
        void m547a(int r2) {
                r1 = this;
                int r0 = r1.f3261a
                r2 = r2 | r0
                r1.f3261a = r2
                return
        }

        /* renamed from: a */
        void m545a(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.f3262b = r1
                r0.f3263c = r2
                r0.f3264d = r3
                r0.f3265e = r4
                return
        }

        /* renamed from: a */
        boolean m548a() {
                r4 = this;
                int r0 = r4.f3261a
                r1 = r0 & 7
                r2 = 0
                if (r1 == 0) goto L_0x0014
                int r1 = r4.f3264d
                int r3 = r4.f3262b
                int r1 = r4.m546a(r1, r3)
                int r1 = r1 << r2
                r0 = r0 & r1
                if (r0 != 0) goto L_0x0014
                return r2
            L_0x0014:
                int r0 = r4.f3261a
                r1 = r0 & 112(0x70, float:1.57E-43)
                if (r1 == 0) goto L_0x0028
                int r1 = r4.f3264d
                int r3 = r4.f3263c
                int r1 = r4.m546a(r1, r3)
                int r1 = r1 << 4
                r0 = r0 & r1
                if (r0 != 0) goto L_0x0028
                return r2
            L_0x0028:
                int r0 = r4.f3261a
                r1 = r0 & 1792(0x700, float:2.511E-42)
                if (r1 == 0) goto L_0x003c
                int r1 = r4.f3265e
                int r3 = r4.f3262b
                int r1 = r4.m546a(r1, r3)
                int r1 = r1 << 8
                r0 = r0 & r1
                if (r0 != 0) goto L_0x003c
                return r2
            L_0x003c:
                int r0 = r4.f3261a
                r1 = r0 & 28672(0x7000, float:4.0178E-41)
                if (r1 == 0) goto L_0x0050
                int r1 = r4.f3265e
                int r3 = r4.f3263c
                int r1 = r4.m546a(r1, r3)
                int r1 = r1 << 12
                r0 = r0 & r1
                if (r0 != 0) goto L_0x0050
                return r2
            L_0x0050:
                r0 = 1
                return r0
        }

        /* renamed from: b */
        void m544b() {
                r1 = this;
                r0 = 0
                r1.f3261a = r0
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    /* loaded from: classes.dex */
    interface AbstractC0860b {
        /* renamed from: a */
        int mo543a();

        /* renamed from: a */
        int mo541a(android.view.View r1);

        /* renamed from: a */
        android.view.View mo542a(int r1);

        /* renamed from: b */
        int mo540b();

        /* renamed from: b */
        int mo539b(android.view.View r1);
    }

    C0858n(androidx.recyclerview.widget.C0858n.AbstractC0860b r1) {
            r0 = this;
            r0.<init>()
            r0.f3259a = r1
            androidx.recyclerview.widget.n$a r1 = new androidx.recyclerview.widget.n$a
            r1.<init>()
            r0.f3260b = r1
            return
    }

    /* renamed from: a */
    android.view.View m550a(int r9, int r10, int r11, int r12) {
            r8 = this;
            androidx.recyclerview.widget.n$b r0 = r8.f3259a
            int r0 = r0.mo540b()
            androidx.recyclerview.widget.n$b r1 = r8.f3259a
            int r1 = r1.mo543a()
            if (r10 <= r9) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = -1
        L_0x0011:
            r3 = 0
        L_0x0012:
            if (r9 == r10) goto L_0x0057
            androidx.recyclerview.widget.n$b r4 = r8.f3259a
            android.view.View r4 = r4.mo542a(r9)
            androidx.recyclerview.widget.n$b r5 = r8.f3259a
            int r5 = r5.mo539b(r4)
            androidx.recyclerview.widget.n$b r6 = r8.f3259a
            int r6 = r6.mo541a(r4)
            androidx.recyclerview.widget.n$a r7 = r8.f3260b
            r7.m545a(r0, r1, r5, r6)
            if (r11 == 0) goto L_0x0040
            androidx.recyclerview.widget.n$a r5 = r8.f3260b
            r5.m544b()
            androidx.recyclerview.widget.n$a r5 = r8.f3260b
            r5.m547a(r11)
            androidx.recyclerview.widget.n$a r5 = r8.f3260b
            boolean r5 = r5.m548a()
            if (r5 == 0) goto L_0x0040
            return r4
        L_0x0040:
            if (r12 == 0) goto L_0x0055
            androidx.recyclerview.widget.n$a r5 = r8.f3260b
            r5.m544b()
            androidx.recyclerview.widget.n$a r5 = r8.f3260b
            r5.m547a(r12)
            androidx.recyclerview.widget.n$a r5 = r8.f3260b
            boolean r5 = r5.m548a()
            if (r5 == 0) goto L_0x0055
            r3 = r4
        L_0x0055:
            int r9 = r9 + r2
            goto L_0x0012
        L_0x0057:
            return r3
    }

    /* renamed from: a */
    boolean m549a(android.view.View r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.n$a r0 = r5.f3260b
            androidx.recyclerview.widget.n$b r1 = r5.f3259a
            int r1 = r1.mo540b()
            androidx.recyclerview.widget.n$b r2 = r5.f3259a
            int r2 = r2.mo543a()
            androidx.recyclerview.widget.n$b r3 = r5.f3259a
            int r3 = r3.mo539b(r6)
            androidx.recyclerview.widget.n$b r4 = r5.f3259a
            int r6 = r4.mo541a(r6)
            r0.m545a(r1, r2, r3, r6)
            if (r7 == 0) goto L_0x0030
            androidx.recyclerview.widget.n$a r6 = r5.f3260b
            r6.m544b()
            androidx.recyclerview.widget.n$a r6 = r5.f3260b
            r6.m547a(r7)
            androidx.recyclerview.widget.n$a r6 = r5.f3260b
            boolean r6 = r6.m548a()
            return r6
        L_0x0030:
            r6 = 0
            return r6
    }
}
