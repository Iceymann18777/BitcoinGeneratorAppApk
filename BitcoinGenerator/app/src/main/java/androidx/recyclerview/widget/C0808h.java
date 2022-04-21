package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
class C0808h {

    /* renamed from: a */
    final androidx.recyclerview.widget.C0808h.AbstractC0809a f3065a;

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes.dex */
    interface AbstractC0809a {
        /* renamed from: a */
        androidx.recyclerview.widget.C0780a.C0782b mo1048a(int r1, int r2, int r3, java.lang.Object r4);

        /* renamed from: a */
        void mo1047a(androidx.recyclerview.widget.C0780a.C0782b r1);
    }

    C0808h(androidx.recyclerview.widget.C0808h.AbstractC0809a r1) {
            r0 = this;
            r0.<init>()
            r0.f3065a = r1
            return
    }

    /* renamed from: a */
    private void m1053a(java.util.List<androidx.recyclerview.widget.C0780a.C0782b> r8, int r9, int r10) {
            r7 = this;
            java.lang.Object r0 = r8.get(r9)
            r4 = r0
            androidx.recyclerview.widget.a$b r4 = (androidx.recyclerview.widget.C0780a.C0782b) r4
            java.lang.Object r0 = r8.get(r10)
            r6 = r0
            androidx.recyclerview.widget.a$b r6 = (androidx.recyclerview.widget.C0780a.C0782b) r6
            int r0 = r6.f2945a
            r1 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 2
            if (r0 == r1) goto L_0x0022
            r1 = 4
            if (r0 == r1) goto L_0x001a
            goto L_0x0031
        L_0x001a:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.m1050b(r2, r3, r4, r5, r6)
            goto L_0x0031
        L_0x0022:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.m1052a(r2, r3, r4, r5, r6)
            goto L_0x0031
        L_0x002a:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.m1049c(r2, r3, r4, r5, r6)
        L_0x0031:
            return
    }

    /* renamed from: b */
    private int m1051b(java.util.List<androidx.recyclerview.widget.C0780a.C0782b> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L_0x0007:
            if (r0 < 0) goto L_0x001c
            java.lang.Object r3 = r6.get(r0)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C0780a.C0782b) r3
            int r3 = r3.f2945a
            r4 = 8
            if (r3 != r4) goto L_0x0018
            if (r2 == 0) goto L_0x0019
            return r0
        L_0x0018:
            r2 = 1
        L_0x0019:
            int r0 = r0 + (-1)
            goto L_0x0007
        L_0x001c:
            r6 = -1
            return r6
    }

    /* renamed from: c */
    private void m1049c(java.util.List<androidx.recyclerview.widget.C0780a.C0782b> r4, int r5, androidx.recyclerview.widget.C0780a.C0782b r6, int r7, androidx.recyclerview.widget.C0780a.C0782b r8) {
            r3 = this;
            int r0 = r6.f2948d
            int r1 = r8.f2946b
            if (r0 >= r1) goto L_0x0008
            r0 = -1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            int r1 = r6.f2946b
            int r2 = r8.f2946b
            if (r1 >= r2) goto L_0x0011
            int r0 = r0 + 1
        L_0x0011:
            int r1 = r8.f2946b
            int r2 = r6.f2946b
            if (r1 > r2) goto L_0x001c
            int r1 = r8.f2948d
            int r2 = r2 + r1
            r6.f2946b = r2
        L_0x001c:
            int r1 = r8.f2946b
            int r2 = r6.f2948d
            if (r1 > r2) goto L_0x0027
            int r1 = r8.f2948d
            int r2 = r2 + r1
            r6.f2948d = r2
        L_0x0027:
            int r1 = r8.f2946b
            int r1 = r1 + r0
            r8.f2946b = r1
            r4.set(r5, r8)
            r4.set(r7, r6)
            return
    }

    /* renamed from: a */
    void m1054a(java.util.List<androidx.recyclerview.widget.C0780a.C0782b> r3) {
            r2 = this;
        L_0x0000:
            int r0 = r2.m1051b(r3)
            r1 = -1
            if (r0 == r1) goto L_0x000d
            int r1 = r0 + 1
            r2.m1053a(r3, r0, r1)
            goto L_0x0000
        L_0x000d:
            return
    }

    /* renamed from: a */
    void m1052a(java.util.List<androidx.recyclerview.widget.C0780a.C0782b> r10, int r11, androidx.recyclerview.widget.C0780a.C0782b r12, int r13, androidx.recyclerview.widget.C0780a.C0782b r14) {
            r9 = this;
            int r0 = r12.f2946b
            int r1 = r12.f2948d
            r2 = 0
            r3 = 1
            int r4 = r14.f2946b
            if (r0 >= r1) goto L_0x0015
            if (r4 != r0) goto L_0x0013
            int r4 = r14.f2948d
            int r1 = r1 - r0
            if (r4 != r1) goto L_0x0013
            r0 = 0
            goto L_0x001f
        L_0x0013:
            r0 = 0
            goto L_0x0022
        L_0x0015:
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0021
            int r4 = r14.f2948d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0021
            r0 = 1
        L_0x001f:
            r2 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            int r1 = r12.f2948d
            int r4 = r14.f2946b
            r5 = 2
            if (r1 >= r4) goto L_0x002d
            int r4 = r4 - r3
            r14.f2946b = r4
            goto L_0x0046
        L_0x002d:
            int r6 = r14.f2948d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0046
            int r6 = r6 - r3
            r14.f2948d = r6
            r12.f2945a = r5
            r12.f2948d = r3
            int r11 = r14.f2948d
            if (r11 != 0) goto L_0x0045
            r10.remove(r13)
            androidx.recyclerview.widget.h$a r10 = r9.f3065a
            r10.mo1047a(r14)
        L_0x0045:
            return
        L_0x0046:
            int r1 = r12.f2946b
            int r4 = r14.f2946b
            r6 = 0
            if (r1 > r4) goto L_0x0051
            int r4 = r4 + r3
            r14.f2946b = r4
            goto L_0x0067
        L_0x0051:
            int r7 = r14.f2948d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0067
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.h$a r7 = r9.f3065a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.mo1048a(r5, r1, r4, r6)
            int r1 = r12.f2946b
            int r3 = r14.f2946b
            int r1 = r1 - r3
            r14.f2948d = r1
        L_0x0067:
            if (r2 == 0) goto L_0x0075
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.h$a r10 = r9.f3065a
            r10.mo1047a(r12)
            return
        L_0x0075:
            if (r0 == 0) goto L_0x00a1
            if (r6 == 0) goto L_0x008f
            int r0 = r12.f2946b
            int r1 = r6.f2946b
            if (r0 <= r1) goto L_0x0084
            int r1 = r6.f2948d
            int r0 = r0 - r1
            r12.f2946b = r0
        L_0x0084:
            int r0 = r12.f2948d
            int r1 = r6.f2946b
            if (r0 <= r1) goto L_0x008f
            int r1 = r6.f2948d
            int r0 = r0 - r1
            r12.f2948d = r0
        L_0x008f:
            int r0 = r12.f2946b
            int r1 = r14.f2946b
            if (r0 <= r1) goto L_0x009a
            int r1 = r14.f2948d
            int r0 = r0 - r1
            r12.f2946b = r0
        L_0x009a:
            int r0 = r12.f2948d
            int r1 = r14.f2946b
            if (r0 <= r1) goto L_0x00cf
            goto L_0x00ca
        L_0x00a1:
            if (r6 == 0) goto L_0x00b9
            int r0 = r12.f2946b
            int r1 = r6.f2946b
            if (r0 < r1) goto L_0x00ae
            int r1 = r6.f2948d
            int r0 = r0 - r1
            r12.f2946b = r0
        L_0x00ae:
            int r0 = r12.f2948d
            int r1 = r6.f2946b
            if (r0 < r1) goto L_0x00b9
            int r1 = r6.f2948d
            int r0 = r0 - r1
            r12.f2948d = r0
        L_0x00b9:
            int r0 = r12.f2946b
            int r1 = r14.f2946b
            if (r0 < r1) goto L_0x00c4
            int r1 = r14.f2948d
            int r0 = r0 - r1
            r12.f2946b = r0
        L_0x00c4:
            int r0 = r12.f2948d
            int r1 = r14.f2946b
            if (r0 < r1) goto L_0x00cf
        L_0x00ca:
            int r1 = r14.f2948d
            int r0 = r0 - r1
            r12.f2948d = r0
        L_0x00cf:
            r10.set(r11, r14)
            int r14 = r12.f2946b
            int r0 = r12.f2948d
            if (r14 == r0) goto L_0x00dc
            r10.set(r13, r12)
            goto L_0x00df
        L_0x00dc:
            r10.remove(r13)
        L_0x00df:
            if (r6 == 0) goto L_0x00e4
            r10.add(r11, r6)
        L_0x00e4:
            return
    }

    /* renamed from: b */
    void m1050b(java.util.List<androidx.recyclerview.widget.C0780a.C0782b> r9, int r10, androidx.recyclerview.widget.C0780a.C0782b r11, int r12, androidx.recyclerview.widget.C0780a.C0782b r13) {
            r8 = this;
            int r0 = r11.f2948d
            int r1 = r13.f2946b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f2946b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f2948d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f2948d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f3065a
            int r1 = r11.f2946b
            java.lang.Object r5 = r13.f2947c
            androidx.recyclerview.widget.a$b r0 = r0.mo1048a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f2946b
            int r5 = r13.f2946b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f2946b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f2948d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r3 = r8.f3065a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f2947c
            androidx.recyclerview.widget.a$b r3 = r3.mo1048a(r2, r1, r5, r4)
            int r1 = r13.f2948d
            int r1 = r1 - r5
            r13.f2948d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f2948d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f3065a
            r11.mo1047a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
    }
}
