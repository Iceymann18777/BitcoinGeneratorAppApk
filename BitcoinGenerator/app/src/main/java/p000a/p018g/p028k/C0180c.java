package p000a.p018g.p028k;

/* renamed from: a.g.k.c */
/* loaded from: classes.dex */
public class C0180c {
    /* renamed from: a */
    public static int m3561a(java.lang.Object... r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000b
            int r2 = java.util.Objects.hash(r2)
            return r2
        L_0x000b:
            int r2 = java.util.Arrays.hashCode(r2)
            return r2
    }

    /* renamed from: a */
    public static boolean m3562a(java.lang.Object r2, java.lang.Object r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000b
            boolean r2 = java.util.Objects.equals(r2, r3)
            return r2
        L_0x000b:
            if (r2 == r3) goto L_0x0018
            if (r2 == 0) goto L_0x0016
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r2 = 0
            goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            return r2
    }
}
