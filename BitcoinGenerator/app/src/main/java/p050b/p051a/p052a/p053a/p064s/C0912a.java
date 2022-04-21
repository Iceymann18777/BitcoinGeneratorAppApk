package p050b.p051a.p052a.p053a.p064s;

/* renamed from: b.a.a.a.s.a */
/* loaded from: classes.dex */
public class C0912a extends p000a.p033i.p034a.AbstractC0237a {
    public static final android.os.Parcelable.Creator<p050b.p051a.p052a.p053a.p064s.C0912a> CREATOR = null;

    /* renamed from: d */
    public final p000a.p013d.C0080g<java.lang.String, android.os.Bundle> f3355d;

    /* renamed from: b.a.a.a.s.a$a */
    /* loaded from: classes.dex */
    static class C0913a implements android.os.Parcelable.ClassLoaderCreator<p050b.p051a.p052a.p053a.p064s.C0912a> {
        C0913a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p050b.p051a.p052a.p053a.p064s.C0912a createFromParcel(android.os.Parcel r3) {
                r2 = this;
                b.a.a.a.s.a r0 = new b.a.a.a.s.a
                r1 = 0
                r0.<init>(r3, r1, r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public p050b.p051a.p052a.p053a.p064s.C0912a createFromParcel(android.os.Parcel r3, java.lang.ClassLoader r4) {
                r2 = this;
                b.a.a.a.s.a r0 = new b.a.a.a.s.a
                r1 = 0
                r0.<init>(r3, r4, r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                b.a.a.a.s.a r1 = r0.createFromParcel(r1)
                return r1
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* bridge */ /* synthetic */ p050b.p051a.p052a.p053a.p064s.C0912a createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                b.a.a.a.s.a r1 = r0.createFromParcel(r1, r2)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public p050b.p051a.p052a.p053a.p064s.C0912a[] newArray(int r1) {
                r0 = this;
                b.a.a.a.s.a[] r1 = new p050b.p051a.p052a.p053a.p064s.C0912a[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                b.a.a.a.s.a[] r1 = r0.newArray(r1)
                return r1
        }
    }

    static {
            b.a.a.a.s.a$a r0 = new b.a.a.a.s.a$a
            r0.<init>()
            p050b.p051a.p052a.p053a.p064s.C0912a.CREATOR = r0
            return
    }

    private C0912a(android.os.Parcel r6, java.lang.ClassLoader r7) {
            r5 = this;
            r5.<init>(r6, r7)
            int r7 = r6.readInt()
            java.lang.String[] r0 = new java.lang.String[r7]
            r6.readStringArray(r0)
            android.os.Bundle[] r1 = new android.os.Bundle[r7]
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            r6.readTypedArray(r1, r2)
            a.d.g r6 = new a.d.g
            r6.<init>(r7)
            r5.f3355d = r6
            r6 = 0
        L_0x001b:
            if (r6 >= r7) goto L_0x0029
            a.d.g<java.lang.String, android.os.Bundle> r2 = r5.f3355d
            r3 = r0[r6]
            r4 = r1[r6]
            r2.put(r3, r4)
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0029:
            return
    }

    /* synthetic */ C0912a(android.os.Parcel r1, java.lang.ClassLoader r2, p050b.p051a.p052a.p053a.p064s.C0912a.C0913a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public C0912a(android.os.Parcelable r1) {
            r0 = this;
            r0.<init>(r1)
            a.d.g r1 = new a.d.g
            r1.<init>()
            r0.f3355d = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ExtendableSavedState{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " states="
            r0.append(r1)
            a.d.g<java.lang.String, android.os.Bundle> r1 = r2.f3355d
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            super.writeToParcel(r6, r7)
            a.d.g<java.lang.String, android.os.Bundle> r7 = r5.f3355d
            int r7 = r7.size()
            r6.writeInt(r7)
            java.lang.String[] r0 = new java.lang.String[r7]
            android.os.Bundle[] r1 = new android.os.Bundle[r7]
            r2 = 0
            r3 = 0
        L_0x0012:
            if (r3 >= r7) goto L_0x002b
            a.d.g<java.lang.String, android.os.Bundle> r4 = r5.f3355d
            java.lang.Object r4 = r4.m4016b(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0[r3] = r4
            a.d.g<java.lang.String, android.os.Bundle> r4 = r5.f3355d
            java.lang.Object r4 = r4.m4013d(r3)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0012
        L_0x002b:
            r6.writeStringArray(r0)
            r6.writeTypedArray(r1, r2)
            return
    }
}
