package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
class C0856l {
    /* renamed from: a */
    static int m578a(androidx.recyclerview.widget.C0813j.C0815a0 r1, androidx.recyclerview.widget.AbstractC0810i r2, android.view.View r3, android.view.View r4, androidx.recyclerview.widget.C0813j.AbstractC0835o r5, boolean r6) {
            int r0 = r5.m697e()
            if (r0 == 0) goto L_0x0035
            int r1 = r1.m907a()
            if (r1 == 0) goto L_0x0035
            if (r3 == 0) goto L_0x0035
            if (r4 != 0) goto L_0x0011
            goto L_0x0035
        L_0x0011:
            if (r6 != 0) goto L_0x0023
            int r1 = r5.m673l(r3)
            int r2 = r5.m673l(r4)
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + 1
            return r1
        L_0x0023:
            int r1 = r2.mo1039a(r4)
            int r3 = r2.mo1033d(r3)
            int r1 = r1 - r3
            int r2 = r2.mo1028g()
            int r1 = java.lang.Math.min(r2, r1)
            return r1
        L_0x0035:
            r1 = 0
            return r1
    }

    /* renamed from: a */
    static int m577a(androidx.recyclerview.widget.C0813j.C0815a0 r4, androidx.recyclerview.widget.AbstractC0810i r5, android.view.View r6, android.view.View r7, androidx.recyclerview.widget.C0813j.AbstractC0835o r8, boolean r9, boolean r10) {
            int r0 = r8.m697e()
            r1 = 0
            if (r0 == 0) goto L_0x0071
            int r0 = r4.m907a()
            if (r0 == 0) goto L_0x0071
            if (r6 == 0) goto L_0x0071
            if (r7 != 0) goto L_0x0012
            goto L_0x0071
        L_0x0012:
            int r0 = r8.m673l(r6)
            int r2 = r8.m673l(r7)
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r8.m673l(r6)
            int r3 = r8.m673l(r7)
            int r2 = java.lang.Math.max(r2, r3)
            if (r10 == 0) goto L_0x0038
            int r4 = r4.m907a()
            int r4 = r4 - r2
            int r4 = r4 + (-1)
            int r4 = java.lang.Math.max(r1, r4)
            goto L_0x003c
        L_0x0038:
            int r4 = java.lang.Math.max(r1, r0)
        L_0x003c:
            if (r9 != 0) goto L_0x003f
            return r4
        L_0x003f:
            int r9 = r5.mo1039a(r7)
            int r10 = r5.mo1033d(r6)
            int r9 = r9 - r10
            int r9 = java.lang.Math.abs(r9)
            int r10 = r8.m673l(r6)
            int r7 = r8.m673l(r7)
            int r10 = r10 - r7
            int r7 = java.lang.Math.abs(r10)
            int r7 = r7 + 1
            float r8 = (float) r9
            float r7 = (float) r7
            float r8 = r8 / r7
            float r4 = (float) r4
            float r4 = r4 * r8
            int r7 = r5.mo1030f()
            int r5 = r5.mo1033d(r6)
            int r7 = r7 - r5
            float r5 = (float) r7
            float r4 = r4 + r5
            int r4 = java.lang.Math.round(r4)
            return r4
        L_0x0071:
            return r1
    }

    /* renamed from: b */
    static int m576b(androidx.recyclerview.widget.C0813j.C0815a0 r1, androidx.recyclerview.widget.AbstractC0810i r2, android.view.View r3, android.view.View r4, androidx.recyclerview.widget.C0813j.AbstractC0835o r5, boolean r6) {
            int r0 = r5.m697e()
            if (r0 == 0) goto L_0x003c
            int r0 = r1.m907a()
            if (r0 == 0) goto L_0x003c
            if (r3 == 0) goto L_0x003c
            if (r4 != 0) goto L_0x0011
            goto L_0x003c
        L_0x0011:
            if (r6 != 0) goto L_0x0018
            int r1 = r1.m907a()
            return r1
        L_0x0018:
            int r6 = r2.mo1039a(r4)
            int r2 = r2.mo1033d(r3)
            int r6 = r6 - r2
            int r2 = r5.m673l(r3)
            int r3 = r5.m673l(r4)
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            int r2 = r2 + 1
            float r3 = (float) r6
            float r2 = (float) r2
            float r3 = r3 / r2
            int r1 = r1.m907a()
            float r1 = (float) r1
            float r3 = r3 * r1
            int r1 = (int) r3
            return r1
        L_0x003c:
            r1 = 0
            return r1
    }
}
