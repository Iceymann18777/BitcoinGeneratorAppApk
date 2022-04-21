package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
class C0780a implements androidx.recyclerview.widget.C0808h.AbstractC0809a {

    /* renamed from: a */
    private p000a.p018g.p028k.AbstractC0181d<androidx.recyclerview.widget.C0780a.C0782b> f2937a;

    /* renamed from: b */
    final java.util.ArrayList<androidx.recyclerview.widget.C0780a.C0782b> f2938b;

    /* renamed from: c */
    final java.util.ArrayList<androidx.recyclerview.widget.C0780a.C0782b> f2939c;

    /* renamed from: d */
    final androidx.recyclerview.widget.C0780a.AbstractC0781a f2940d;

    /* renamed from: e */
    java.lang.Runnable f2941e;

    /* renamed from: f */
    final boolean f2942f;

    /* renamed from: g */
    final androidx.recyclerview.widget.C0808h f2943g;

    /* renamed from: h */
    private int f2944h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    interface AbstractC0781a {
        /* renamed from: a */
        androidx.recyclerview.widget.C0813j.AbstractC0821d0 mo842a(int r1);

        /* renamed from: a */
        void mo841a(int r1, int r2);

        /* renamed from: a */
        void mo840a(int r1, int r2, java.lang.Object r3);

        /* renamed from: a */
        void mo839a(androidx.recyclerview.widget.C0780a.C0782b r1);

        /* renamed from: b */
        void mo838b(int r1, int r2);

        /* renamed from: b */
        void mo837b(androidx.recyclerview.widget.C0780a.C0782b r1);

        /* renamed from: c */
        void mo836c(int r1, int r2);

        /* renamed from: d */
        void mo834d(int r1, int r2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    static class C0782b {

        /* renamed from: a */
        int f2945a;

        /* renamed from: b */
        int f2946b;

        /* renamed from: c */
        java.lang.Object f2947c;

        /* renamed from: d */
        int f2948d;

        C0782b(int r1, int r2, int r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.f2945a = r1
                r0.f2946b = r2
                r0.f2948d = r3
                r0.f2947c = r4
                return
        }

        /* renamed from: a */
        java.lang.String m1131a() {
                r2 = this;
                int r0 = r2.f2945a
                r1 = 1
                if (r0 == r1) goto L_0x001b
                r1 = 2
                if (r0 == r1) goto L_0x0018
                r1 = 4
                if (r0 == r1) goto L_0x0015
                r1 = 8
                if (r0 == r1) goto L_0x0012
                java.lang.String r0 = "??"
                return r0
            L_0x0012:
                java.lang.String r0 = "mv"
                return r0
            L_0x0015:
                java.lang.String r0 = "up"
                return r0
            L_0x0018:
                java.lang.String r0 = "rm"
                return r0
            L_0x001b:
                java.lang.String r0 = "add"
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r5 == 0) goto L_0x0054
                java.lang.Class<androidx.recyclerview.widget.a$b> r2 = androidx.recyclerview.widget.C0780a.C0782b.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L_0x0010
                goto L_0x0054
            L_0x0010:
                androidx.recyclerview.widget.a$b r5 = (androidx.recyclerview.widget.C0780a.C0782b) r5
                int r2 = r4.f2945a
                int r3 = r5.f2945a
                if (r2 == r3) goto L_0x0019
                return r1
            L_0x0019:
                r3 = 8
                if (r2 != r3) goto L_0x0035
                int r2 = r4.f2948d
                int r3 = r4.f2946b
                int r2 = r2 - r3
                int r2 = java.lang.Math.abs(r2)
                if (r2 != r0) goto L_0x0035
                int r2 = r4.f2948d
                int r3 = r5.f2946b
                if (r2 != r3) goto L_0x0035
                int r2 = r4.f2946b
                int r3 = r5.f2948d
                if (r2 != r3) goto L_0x0035
                return r0
            L_0x0035:
                int r2 = r4.f2948d
                int r3 = r5.f2948d
                if (r2 == r3) goto L_0x003c
                return r1
            L_0x003c:
                int r2 = r4.f2946b
                int r3 = r5.f2946b
                if (r2 == r3) goto L_0x0043
                return r1
            L_0x0043:
                java.lang.Object r2 = r4.f2947c
                java.lang.Object r5 = r5.f2947c
                if (r2 == 0) goto L_0x0050
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L_0x0053
                return r1
            L_0x0050:
                if (r5 == 0) goto L_0x0053
                return r1
            L_0x0053:
                return r0
            L_0x0054:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f2945a
                int r0 = r0 * 31
                int r1 = r2.f2946b
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.f2948d
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = "["
                r0.append(r1)
                java.lang.String r1 = r2.m1131a()
                r0.append(r1)
                java.lang.String r1 = ",s:"
                r0.append(r1)
                int r1 = r2.f2946b
                r0.append(r1)
                java.lang.String r1 = "c:"
                r0.append(r1)
                int r1 = r2.f2948d
                r0.append(r1)
                java.lang.String r1 = ",p:"
                r0.append(r1)
                java.lang.Object r1 = r2.f2947c
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    C0780a(androidx.recyclerview.widget.C0780a.AbstractC0781a r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    C0780a(androidx.recyclerview.widget.C0780a.AbstractC0781a r3, boolean r4) {
            r2 = this;
            r2.<init>()
            a.g.k.e r0 = new a.g.k.e
            r1 = 30
            r0.<init>(r1)
            r2.f2937a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f2938b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f2939c = r0
            r0 = 0
            r2.f2944h = r0
            r2.f2940d = r3
            r2.f2942f = r4
            androidx.recyclerview.widget.h r3 = new androidx.recyclerview.widget.h
            r3.<init>(r2)
            r2.f2943g = r3
            return
    }

    /* renamed from: b */
    private int m1144b(int r8, int r9) {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f2939c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L_0x0008:
            r2 = 8
            if (r0 < 0) goto L_0x0084
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r7.f2939c
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C0780a.C0782b) r3
            int r4 = r3.f2945a
            r5 = 2
            if (r4 != r2) goto L_0x0065
            int r2 = r3.f2946b
            int r4 = r3.f2948d
            if (r2 >= r4) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            r6 = r4
            r4 = r2
            r2 = r6
        L_0x0023:
            if (r8 < r2) goto L_0x004b
            if (r8 > r4) goto L_0x004b
            int r4 = r3.f2946b
            if (r2 != r4) goto L_0x003c
            if (r9 != r1) goto L_0x0033
            int r2 = r3.f2948d
            int r2 = r2 + r1
        L_0x0030:
            r3.f2948d = r2
            goto L_0x0039
        L_0x0033:
            if (r9 != r5) goto L_0x0039
            int r2 = r3.f2948d
            int r2 = r2 - r1
            goto L_0x0030
        L_0x0039:
            int r8 = r8 + 1
            goto L_0x0081
        L_0x003c:
            if (r9 != r1) goto L_0x0043
            int r4 = r4 + 1
        L_0x0040:
            r3.f2946b = r4
            goto L_0x0048
        L_0x0043:
            if (r9 != r5) goto L_0x0048
            int r4 = r4 + (-1)
            goto L_0x0040
        L_0x0048:
            int r8 = r8 + (-1)
            goto L_0x0081
        L_0x004b:
            int r2 = r3.f2946b
            if (r8 >= r2) goto L_0x0081
            if (r9 != r1) goto L_0x005b
            int r2 = r2 + 1
            r3.f2946b = r2
            int r2 = r3.f2948d
            int r2 = r2 + r1
        L_0x0058:
            r3.f2948d = r2
            goto L_0x0081
        L_0x005b:
            if (r9 != r5) goto L_0x0081
            int r2 = r2 + (-1)
            r3.f2946b = r2
            int r2 = r3.f2948d
            int r2 = r2 - r1
            goto L_0x0058
        L_0x0065:
            int r2 = r3.f2946b
            if (r2 > r8) goto L_0x0075
            if (r4 != r1) goto L_0x006f
            int r2 = r3.f2948d
            int r8 = r8 - r2
            goto L_0x0081
        L_0x006f:
            if (r4 != r5) goto L_0x0081
            int r2 = r3.f2948d
            int r8 = r8 + r2
            goto L_0x0081
        L_0x0075:
            if (r9 != r1) goto L_0x007c
            int r2 = r2 + 1
        L_0x0079:
            r3.f2946b = r2
            goto L_0x0081
        L_0x007c:
            if (r9 != r5) goto L_0x0081
            int r2 = r2 + (-1)
            goto L_0x0079
        L_0x0081:
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x0084:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r9 = r7.f2939c
            int r9 = r9.size()
            int r9 = r9 - r1
        L_0x008b:
            if (r9 < 0) goto L_0x00b1
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f2939c
            java.lang.Object r0 = r0.get(r9)
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.C0780a.C0782b) r0
            int r1 = r0.f2945a
            if (r1 != r2) goto L_0x00a2
            int r1 = r0.f2948d
            int r3 = r0.f2946b
            if (r1 == r3) goto L_0x00a6
            if (r1 >= 0) goto L_0x00ae
            goto L_0x00a6
        L_0x00a2:
            int r1 = r0.f2948d
            if (r1 > 0) goto L_0x00ae
        L_0x00a6:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r7.f2939c
            r1.remove(r9)
            r7.mo1047a(r0)
        L_0x00ae:
            int r9 = r9 + (-1)
            goto L_0x008b
        L_0x00b1:
            return r8
    }

    /* renamed from: b */
    private void m1143b(androidx.recyclerview.widget.C0780a.C0782b r1) {
            r0 = this;
            r0.m1132g(r1)
            return
    }

    /* renamed from: c */
    private void m1140c(androidx.recyclerview.widget.C0780a.C0782b r1) {
            r0 = this;
            r0.m1132g(r1)
            return
    }

    /* renamed from: d */
    private void m1137d(androidx.recyclerview.widget.C0780a.C0782b r11) {
            r10 = this;
            int r0 = r11.f2946b
            int r1 = r11.f2948d
            int r1 = r1 + r0
            r2 = 0
            r3 = -1
            r3 = r1
            r4 = 0
            r5 = -1
            r1 = r0
        L_0x000b:
            r6 = 0
            r7 = 2
            if (r1 >= r3) goto L_0x0045
            androidx.recyclerview.widget.a$a r8 = r10.f2940d
            androidx.recyclerview.widget.j$d0 r8 = r8.mo842a(r1)
            r9 = 1
            if (r8 != 0) goto L_0x002d
            boolean r8 = r10.m1138d(r1)
            if (r8 == 0) goto L_0x001f
            goto L_0x002d
        L_0x001f:
            if (r5 != r9) goto L_0x002a
            androidx.recyclerview.widget.a$b r5 = r10.mo1048a(r7, r0, r4, r6)
            r10.m1132g(r5)
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r6 = 0
            goto L_0x003a
        L_0x002d:
            if (r5 != 0) goto L_0x0038
            androidx.recyclerview.widget.a$b r5 = r10.mo1048a(r7, r0, r4, r6)
            r10.m1133f(r5)
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            r6 = 1
        L_0x003a:
            if (r5 == 0) goto L_0x0040
            int r1 = r1 - r4
            int r3 = r3 - r4
            r4 = 1
            goto L_0x0042
        L_0x0040:
            int r4 = r4 + 1
        L_0x0042:
            int r1 = r1 + r9
            r5 = r6
            goto L_0x000b
        L_0x0045:
            int r1 = r11.f2948d
            if (r4 == r1) goto L_0x0050
            r10.mo1047a(r11)
            androidx.recyclerview.widget.a$b r11 = r10.mo1048a(r7, r0, r4, r6)
        L_0x0050:
            if (r5 != 0) goto L_0x0056
            r10.m1133f(r11)
            goto L_0x0059
        L_0x0056:
            r10.m1132g(r11)
        L_0x0059:
            return
    }

    /* renamed from: d */
    private boolean m1138d(int r8) {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f2939c
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x003c
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r7.f2939c
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C0780a.C0782b) r3
            int r4 = r3.f2945a
            r5 = 8
            r6 = 1
            if (r4 != r5) goto L_0x0024
            int r3 = r3.f2948d
            int r4 = r2 + 1
            int r3 = r7.m1149a(r3, r4)
            if (r3 != r8) goto L_0x0039
            return r6
        L_0x0024:
            if (r4 != r6) goto L_0x0039
            int r4 = r3.f2946b
            int r3 = r3.f2948d
            int r3 = r3 + r4
        L_0x002b:
            if (r4 >= r3) goto L_0x0039
            int r5 = r2 + 1
            int r5 = r7.m1149a(r4, r5)
            if (r5 != r8) goto L_0x0036
            return r6
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x002b
        L_0x0039:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x003c:
            return r1
    }

    /* renamed from: e */
    private void m1135e(androidx.recyclerview.widget.C0780a.C0782b r10) {
            r9 = this;
            int r0 = r10.f2946b
            int r1 = r10.f2948d
            int r1 = r1 + r0
            r2 = 0
            r3 = -1
            r4 = r0
            r3 = 0
            r5 = -1
        L_0x000a:
            r6 = 4
            if (r0 >= r1) goto L_0x003e
            androidx.recyclerview.widget.a$a r7 = r9.f2940d
            androidx.recyclerview.widget.j$d0 r7 = r7.mo842a(r0)
            r8 = 1
            if (r7 != 0) goto L_0x002c
            boolean r7 = r9.m1138d(r0)
            if (r7 == 0) goto L_0x001d
            goto L_0x002c
        L_0x001d:
            if (r5 != r8) goto L_0x002a
            java.lang.Object r5 = r10.f2947c
            androidx.recyclerview.widget.a$b r3 = r9.mo1048a(r6, r4, r3, r5)
            r9.m1132g(r3)
            r4 = r0
            r3 = 0
        L_0x002a:
            r5 = 0
            goto L_0x003a
        L_0x002c:
            if (r5 != 0) goto L_0x0039
            java.lang.Object r5 = r10.f2947c
            androidx.recyclerview.widget.a$b r3 = r9.mo1048a(r6, r4, r3, r5)
            r9.m1133f(r3)
            r4 = r0
            r3 = 0
        L_0x0039:
            r5 = 1
        L_0x003a:
            int r3 = r3 + r8
            int r0 = r0 + 1
            goto L_0x000a
        L_0x003e:
            int r0 = r10.f2948d
            if (r3 == r0) goto L_0x004b
            java.lang.Object r0 = r10.f2947c
            r9.mo1047a(r10)
            androidx.recyclerview.widget.a$b r10 = r9.mo1048a(r6, r4, r3, r0)
        L_0x004b:
            if (r5 != 0) goto L_0x0051
            r9.m1133f(r10)
            goto L_0x0054
        L_0x0051:
            r9.m1132g(r10)
        L_0x0054:
            return
    }

    /* renamed from: f */
    private void m1133f(androidx.recyclerview.widget.C0780a.C0782b r13) {
            r12 = this;
            int r0 = r13.f2945a
            r1 = 1
            if (r0 == r1) goto L_0x0089
            r2 = 8
            if (r0 == r2) goto L_0x0089
            int r2 = r13.f2946b
            int r0 = r12.m1144b(r2, r0)
            int r2 = r13.f2946b
            int r3 = r13.f2945a
            r4 = 2
            r5 = 4
            r6 = 0
            if (r3 == r4) goto L_0x0033
            if (r3 != r5) goto L_0x001c
            r3 = 1
            goto L_0x0034
        L_0x001c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "op should be remove or update."
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L_0x0033:
            r3 = 0
        L_0x0034:
            r7 = r0
            r8 = r2
            r0 = 1
            r2 = 1
        L_0x0038:
            int r9 = r13.f2948d
            if (r0 >= r9) goto L_0x0075
            int r9 = r13.f2946b
            int r10 = r3 * r0
            int r9 = r9 + r10
            int r10 = r13.f2945a
            int r9 = r12.m1144b(r9, r10)
            int r10 = r13.f2945a
            if (r10 == r4) goto L_0x0055
            if (r10 == r5) goto L_0x004f
        L_0x004d:
            r10 = 0
            goto L_0x0058
        L_0x004f:
            int r10 = r7 + 1
            if (r9 != r10) goto L_0x004d
        L_0x0053:
            r10 = 1
            goto L_0x0058
        L_0x0055:
            if (r9 != r7) goto L_0x004d
            goto L_0x0053
        L_0x0058:
            if (r10 == 0) goto L_0x005d
            int r2 = r2 + 1
            goto L_0x0072
        L_0x005d:
            int r10 = r13.f2945a
            java.lang.Object r11 = r13.f2947c
            androidx.recyclerview.widget.a$b r7 = r12.mo1048a(r10, r7, r2, r11)
            r12.m1148a(r7, r8)
            r12.mo1047a(r7)
            int r7 = r13.f2945a
            if (r7 != r5) goto L_0x0070
            int r8 = r8 + r2
        L_0x0070:
            r7 = r9
            r2 = 1
        L_0x0072:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x0075:
            java.lang.Object r0 = r13.f2947c
            r12.mo1047a(r13)
            if (r2 <= 0) goto L_0x0088
            int r13 = r13.f2945a
            androidx.recyclerview.widget.a$b r13 = r12.mo1048a(r13, r7, r2, r0)
            r12.m1148a(r13, r8)
            r12.mo1047a(r13)
        L_0x0088:
            return
        L_0x0089:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            goto L_0x0092
        L_0x0091:
            throw r13
        L_0x0092:
            goto L_0x0091
    }

    /* renamed from: g */
    private void m1132g(androidx.recyclerview.widget.C0780a.C0782b r4) {
            r3 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r3.f2939c
            r0.add(r4)
            int r0 = r4.f2945a
            r1 = 1
            if (r0 == r1) goto L_0x004b
            r1 = 2
            if (r0 == r1) goto L_0x0041
            r1 = 4
            if (r0 == r1) goto L_0x0035
            r1 = 8
            if (r0 != r1) goto L_0x001e
            androidx.recyclerview.widget.a$a r0 = r3.f2940d
            int r1 = r4.f2946b
            int r4 = r4.f2948d
            r0.mo841a(r1, r4)
            goto L_0x0054
        L_0x001e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown update op type for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0035:
            androidx.recyclerview.widget.a$a r0 = r3.f2940d
            int r1 = r4.f2946b
            int r2 = r4.f2948d
            java.lang.Object r4 = r4.f2947c
            r0.mo840a(r1, r2, r4)
            goto L_0x0054
        L_0x0041:
            androidx.recyclerview.widget.a$a r0 = r3.f2940d
            int r1 = r4.f2946b
            int r4 = r4.f2948d
            r0.mo834d(r1, r4)
            goto L_0x0054
        L_0x004b:
            androidx.recyclerview.widget.a$a r0 = r3.f2940d
            int r1 = r4.f2946b
            int r4 = r4.f2948d
            r0.mo838b(r1, r4)
        L_0x0054:
            return
    }

    /* renamed from: a */
    public int m1150a(int r6) {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f2938b
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0047
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r5.f2938b
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.a$b r2 = (androidx.recyclerview.widget.C0780a.C0782b) r2
            int r3 = r2.f2945a
            r4 = 1
            if (r3 == r4) goto L_0x003d
            r4 = 2
            if (r3 == r4) goto L_0x0030
            r4 = 8
            if (r3 == r4) goto L_0x001e
            goto L_0x0044
        L_0x001e:
            int r3 = r2.f2946b
            if (r3 != r6) goto L_0x0025
            int r6 = r2.f2948d
            goto L_0x0044
        L_0x0025:
            if (r3 >= r6) goto L_0x0029
            int r6 = r6 + (-1)
        L_0x0029:
            int r2 = r2.f2948d
            if (r2 > r6) goto L_0x0044
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0030:
            int r3 = r2.f2946b
            if (r3 > r6) goto L_0x0044
            int r2 = r2.f2948d
            int r3 = r3 + r2
            if (r3 <= r6) goto L_0x003b
            r6 = -1
            return r6
        L_0x003b:
            int r6 = r6 - r2
            goto L_0x0044
        L_0x003d:
            int r3 = r2.f2946b
            if (r3 > r6) goto L_0x0044
            int r2 = r2.f2948d
            int r6 = r6 + r2
        L_0x0044:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0047:
            return r6
    }

    /* renamed from: a */
    int m1149a(int r6, int r7) {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f2939c
            int r0 = r0.size()
        L_0x0006:
            if (r7 >= r0) goto L_0x0041
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r5.f2939c
            java.lang.Object r1 = r1.get(r7)
            androidx.recyclerview.widget.a$b r1 = (androidx.recyclerview.widget.C0780a.C0782b) r1
            int r2 = r1.f2945a
            r3 = 8
            if (r2 != r3) goto L_0x0028
            int r2 = r1.f2946b
            if (r2 != r6) goto L_0x001d
            int r6 = r1.f2948d
            goto L_0x003e
        L_0x001d:
            if (r2 >= r6) goto L_0x0021
            int r6 = r6 + (-1)
        L_0x0021:
            int r1 = r1.f2948d
            if (r1 > r6) goto L_0x003e
            int r6 = r6 + 1
            goto L_0x003e
        L_0x0028:
            int r3 = r1.f2946b
            if (r3 > r6) goto L_0x003e
            r4 = 2
            if (r2 != r4) goto L_0x0038
            int r1 = r1.f2948d
            int r3 = r3 + r1
            if (r6 >= r3) goto L_0x0036
            r6 = -1
            return r6
        L_0x0036:
            int r6 = r6 - r1
            goto L_0x003e
        L_0x0038:
            r3 = 1
            if (r2 != r3) goto L_0x003e
            int r1 = r1.f2948d
            int r6 = r6 + r1
        L_0x003e:
            int r7 = r7 + 1
            goto L_0x0006
        L_0x0041:
            return r6
    }

    @Override // androidx.recyclerview.widget.C0808h.AbstractC0809a
    /* renamed from: a */
    public androidx.recyclerview.widget.C0780a.C0782b mo1048a(int r2, int r3, int r4, java.lang.Object r5) {
            r1 = this;
            a.g.k.d<androidx.recyclerview.widget.a$b> r0 = r1.f2937a
            java.lang.Object r0 = r0.mo3559a()
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.C0780a.C0782b) r0
            if (r0 != 0) goto L_0x0010
            androidx.recyclerview.widget.a$b r0 = new androidx.recyclerview.widget.a$b
            r0.<init>(r2, r3, r4, r5)
            goto L_0x0018
        L_0x0010:
            r0.f2945a = r2
            r0.f2946b = r3
            r0.f2948d = r4
            r0.f2947c = r5
        L_0x0018:
            return r0
    }

    /* renamed from: a */
    void m1151a() {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f2939c
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x001a
            androidx.recyclerview.widget.a$a r3 = r5.f2940d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r4 = r5.f2939c
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.a$b r4 = (androidx.recyclerview.widget.C0780a.C0782b) r4
            r3.mo839a(r4)
            int r2 = r2 + 1
            goto L_0x0008
        L_0x001a:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f2939c
            r5.m1147a(r0)
            r5.f2944h = r1
            return
    }

    @Override // androidx.recyclerview.widget.C0808h.AbstractC0809a
    /* renamed from: a */
    public void mo1047a(androidx.recyclerview.widget.C0780a.C0782b r2) {
            r1 = this;
            boolean r0 = r1.f2942f
            if (r0 != 0) goto L_0x000c
            r0 = 0
            r2.f2947c = r0
            a.g.k.d<androidx.recyclerview.widget.a$b> r0 = r1.f2937a
            r0.mo3558a(r2)
        L_0x000c:
            return
    }

    /* renamed from: a */
    void m1148a(androidx.recyclerview.widget.C0780a.C0782b r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.a$a r0 = r2.f2940d
            r0.mo837b(r3)
            int r0 = r3.f2945a
            r1 = 2
            if (r0 == r1) goto L_0x001f
            r1 = 4
            if (r0 != r1) goto L_0x0017
            androidx.recyclerview.widget.a$a r0 = r2.f2940d
            int r1 = r3.f2948d
            java.lang.Object r3 = r3.f2947c
            r0.mo840a(r4, r1, r3)
            goto L_0x0026
        L_0x0017:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "only remove and update ops can be dispatched in first pass"
            r3.<init>(r4)
            throw r3
        L_0x001f:
            androidx.recyclerview.widget.a$a r0 = r2.f2940d
            int r3 = r3.f2948d
            r0.mo836c(r4, r3)
        L_0x0026:
            return
    }

    /* renamed from: a */
    void m1147a(java.util.List<androidx.recyclerview.widget.C0780a.C0782b> r4) {
            r3 = this;
            int r0 = r4.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0013
            java.lang.Object r2 = r4.get(r1)
            androidx.recyclerview.widget.a$b r2 = (androidx.recyclerview.widget.C0780a.C0782b) r2
            r3.mo1047a(r2)
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0013:
            r4.clear()
            return
    }

    /* renamed from: b */
    int m1145b(int r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.m1149a(r2, r0)
            return r2
    }

    /* renamed from: b */
    void m1146b() {
            r7 = this;
            r7.m1151a()
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f2938b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x000b:
            if (r2 >= r0) goto L_0x006c
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r7.f2938b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C0780a.C0782b) r3
            int r4 = r3.f2945a
            r5 = 1
            if (r4 == r5) goto L_0x0054
            r5 = 2
            if (r4 == r5) goto L_0x0045
            r5 = 4
            if (r4 == r5) goto L_0x0034
            r5 = 8
            if (r4 == r5) goto L_0x0025
            goto L_0x0062
        L_0x0025:
            androidx.recyclerview.widget.a$a r4 = r7.f2940d
            r4.mo839a(r3)
            androidx.recyclerview.widget.a$a r4 = r7.f2940d
            int r5 = r3.f2946b
            int r3 = r3.f2948d
            r4.mo841a(r5, r3)
            goto L_0x0062
        L_0x0034:
            androidx.recyclerview.widget.a$a r4 = r7.f2940d
            r4.mo839a(r3)
            androidx.recyclerview.widget.a$a r4 = r7.f2940d
            int r5 = r3.f2946b
            int r6 = r3.f2948d
            java.lang.Object r3 = r3.f2947c
            r4.mo840a(r5, r6, r3)
            goto L_0x0062
        L_0x0045:
            androidx.recyclerview.widget.a$a r4 = r7.f2940d
            r4.mo839a(r3)
            androidx.recyclerview.widget.a$a r4 = r7.f2940d
            int r5 = r3.f2946b
            int r3 = r3.f2948d
            r4.mo836c(r5, r3)
            goto L_0x0062
        L_0x0054:
            androidx.recyclerview.widget.a$a r4 = r7.f2940d
            r4.mo839a(r3)
            androidx.recyclerview.widget.a$a r4 = r7.f2940d
            int r5 = r3.f2946b
            int r3 = r3.f2948d
            r4.mo838b(r5, r3)
        L_0x0062:
            java.lang.Runnable r3 = r7.f2941e
            if (r3 == 0) goto L_0x0069
            r3.run()
        L_0x0069:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x006c:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f2938b
            r7.m1147a(r0)
            r7.f2944h = r1
            return
    }

    /* renamed from: c */
    boolean m1142c() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r1.f2938b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            return r0
    }

    /* renamed from: c */
    boolean m1141c(int r2) {
            r1 = this;
            int r0 = r1.f2944h
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0007
            r2 = 1
            goto L_0x0008
        L_0x0007:
            r2 = 0
        L_0x0008:
            return r2
    }

    /* renamed from: d */
    boolean m1139d() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r1.f2939c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0012
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r1.f2938b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
    }

    /* renamed from: e */
    void m1136e() {
            r5 = this;
            androidx.recyclerview.widget.h r0 = r5.f2943g
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r5.f2938b
            r0.m1054a(r1)
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f2938b
            int r0 = r0.size()
            r1 = 0
        L_0x000e:
            if (r1 >= r0) goto L_0x0041
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r5.f2938b
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.a$b r2 = (androidx.recyclerview.widget.C0780a.C0782b) r2
            int r3 = r2.f2945a
            r4 = 1
            if (r3 == r4) goto L_0x0034
            r4 = 2
            if (r3 == r4) goto L_0x0030
            r4 = 4
            if (r3 == r4) goto L_0x002c
            r4 = 8
            if (r3 == r4) goto L_0x0028
            goto L_0x0037
        L_0x0028:
            r5.m1140c(r2)
            goto L_0x0037
        L_0x002c:
            r5.m1135e(r2)
            goto L_0x0037
        L_0x0030:
            r5.m1137d(r2)
            goto L_0x0037
        L_0x0034:
            r5.m1143b(r2)
        L_0x0037:
            java.lang.Runnable r2 = r5.f2941e
            if (r2 == 0) goto L_0x003e
            r2.run()
        L_0x003e:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0041:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f2938b
            r0.clear()
            return
    }

    /* renamed from: f */
    void m1134f() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r1.f2938b
            r1.m1147a(r0)
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r1.f2939c
            r1.m1147a(r0)
            r0 = 0
            r1.f2944h = r0
            return
    }
}
