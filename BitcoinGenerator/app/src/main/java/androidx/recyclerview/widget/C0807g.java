package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
class C0807g {

    /* renamed from: a */
    boolean f3056a;

    /* renamed from: b */
    int f3057b;

    /* renamed from: c */
    int f3058c;

    /* renamed from: d */
    int f3059d;

    /* renamed from: e */
    int f3060e;

    /* renamed from: f */
    int f3061f;

    /* renamed from: g */
    int f3062g;

    /* renamed from: h */
    boolean f3063h;

    /* renamed from: i */
    boolean f3064i;

    C0807g() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f3056a = r0
            r0 = 0
            r1.f3061f = r0
            r1.f3062g = r0
            return
    }

    /* renamed from: a */
    android.view.View m1055a(androidx.recyclerview.widget.C0813j.C0847v r3) {
            r2 = this;
            int r0 = r2.f3058c
            android.view.View r3 = r3.m603d(r0)
            int r0 = r2.f3058c
            int r1 = r2.f3059d
            int r0 = r0 + r1
            r2.f3058c = r0
            return r3
    }

    /* renamed from: a */
    boolean m1056a(androidx.recyclerview.widget.C0813j.C0815a0 r2) {
            r1 = this;
            int r0 = r1.f3058c
            if (r0 < 0) goto L_0x000c
            int r2 = r2.m907a()
            if (r0 >= r2) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LayoutState{mAvailable="
            r0.append(r1)
            int r1 = r2.f3057b
            r0.append(r1)
            java.lang.String r1 = ", mCurrentPosition="
            r0.append(r1)
            int r1 = r2.f3058c
            r0.append(r1)
            java.lang.String r1 = ", mItemDirection="
            r0.append(r1)
            int r1 = r2.f3059d
            r0.append(r1)
            java.lang.String r1 = ", mLayoutDirection="
            r0.append(r1)
            int r1 = r2.f3060e
            r0.append(r1)
            java.lang.String r1 = ", mStartLine="
            r0.append(r1)
            int r1 = r2.f3061f
            r0.append(r1)
            java.lang.String r1 = ", mEndLine="
            r0.append(r1)
            int r1 = r2.f3062g
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
