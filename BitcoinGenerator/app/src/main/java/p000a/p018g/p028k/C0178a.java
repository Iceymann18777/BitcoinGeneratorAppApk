package p000a.p018g.p028k;

/* renamed from: a.g.k.a */
/* loaded from: classes.dex */
public class C0178a {
    /* renamed from: a */
    public static void m3564a(java.lang.Object r2, java.lang.StringBuilder r3) {
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = "null"
        L_0x0004:
            r3.append(r2)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            if (r0 == 0) goto L_0x0018
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002e
        L_0x0018:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002e
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002e:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            goto L_0x0004
        L_0x003f:
            return
    }
}
