package p000a.p045n;

/* renamed from: a.n.s */
/* loaded from: classes.dex */
public class C0383s {

    /* renamed from: a */
    public final java.util.Map<java.lang.String, java.lang.Object> f1166a;

    /* renamed from: b */
    public android.view.View f1167b;

    /* renamed from: c */
    final java.util.ArrayList<p000a.p045n.AbstractC0367m> f1168c;

    public C0383s() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1166a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1168c = r0
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000a.p045n.C0383s
            if (r0 == 0) goto L_0x0018
            android.view.View r0 = r2.f1167b
            a.n.s r3 = (p000a.p045n.C0383s) r3
            android.view.View r1 = r3.f1167b
            if (r0 != r1) goto L_0x0018
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f1166a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f1166a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0018
            r3 = 1
            return r3
        L_0x0018:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            android.view.View r0 = r2.f1167b
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.f1166a
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TransitionValues@"
            r0.append(r1)
            int r1 = r5.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ":\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "    view = "
            r1.append(r0)
            android.view.View r0 = r5.f1167b
            r1.append(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "    values:"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f1166a
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0054:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "    "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = ": "
            r4.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.f1166a
            java.lang.Object r1 = r1.get(r3)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r1 = r4.toString()
            goto L_0x0054
        L_0x0086:
            return r1
    }
}
