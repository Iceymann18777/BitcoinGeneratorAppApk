package androidx.lifecycle;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public class C0747h extends androidx.lifecycle.AbstractC0742e {

    /* renamed from: a */
    private p000a.p007b.p008a.p010b.C0048a<androidx.lifecycle.AbstractC0745f, androidx.lifecycle.C0747h.C0749b> f2813a;

    /* renamed from: b */
    private androidx.lifecycle.AbstractC0742e.EnumC0744b f2814b;

    /* renamed from: c */
    private final java.lang.ref.WeakReference<androidx.lifecycle.AbstractC0746g> f2815c;

    /* renamed from: d */
    private int f2816d;

    /* renamed from: e */
    private boolean f2817e;

    /* renamed from: f */
    private boolean f2818f;

    /* renamed from: g */
    private java.util.ArrayList<androidx.lifecycle.AbstractC0742e.EnumC0744b> f2819g;

    /* renamed from: androidx.lifecycle.h$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0748a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2820a = null;

        /* renamed from: b */
        static final /* synthetic */ int[] f2821b = null;

        static {
                androidx.lifecycle.e$b[] r0 = androidx.lifecycle.AbstractC0742e.EnumC0744b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.C0747h.C0748a.f2821b = r0
                r0 = 1
                int[] r1 = androidx.lifecycle.C0747h.C0748a.f2821b     // Catch: NoSuchFieldError -> 0x0014
                androidx.lifecycle.e$b r2 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2808c     // Catch: NoSuchFieldError -> 0x0014
                int r2 = r2.ordinal()     // Catch: NoSuchFieldError -> 0x0014
                r1[r2] = r0     // Catch: NoSuchFieldError -> 0x0014
            L_0x0014:
                r1 = 2
                int[] r2 = androidx.lifecycle.C0747h.C0748a.f2821b     // Catch: NoSuchFieldError -> 0x001f
                androidx.lifecycle.e$b r3 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2809d     // Catch: NoSuchFieldError -> 0x001f
                int r3 = r3.ordinal()     // Catch: NoSuchFieldError -> 0x001f
                r2[r3] = r1     // Catch: NoSuchFieldError -> 0x001f
            L_0x001f:
                r2 = 3
                int[] r3 = androidx.lifecycle.C0747h.C0748a.f2821b     // Catch: NoSuchFieldError -> 0x002a
                androidx.lifecycle.e$b r4 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2810e     // Catch: NoSuchFieldError -> 0x002a
                int r4 = r4.ordinal()     // Catch: NoSuchFieldError -> 0x002a
                r3[r4] = r2     // Catch: NoSuchFieldError -> 0x002a
            L_0x002a:
                r3 = 4
                int[] r4 = androidx.lifecycle.C0747h.C0748a.f2821b     // Catch: NoSuchFieldError -> 0x0035
                androidx.lifecycle.e$b r5 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2811f     // Catch: NoSuchFieldError -> 0x0035
                int r5 = r5.ordinal()     // Catch: NoSuchFieldError -> 0x0035
                r4[r5] = r3     // Catch: NoSuchFieldError -> 0x0035
            L_0x0035:
                r4 = 5
                int[] r5 = androidx.lifecycle.C0747h.C0748a.f2821b     // Catch: NoSuchFieldError -> 0x0040
                androidx.lifecycle.e$b r6 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2807b     // Catch: NoSuchFieldError -> 0x0040
                int r6 = r6.ordinal()     // Catch: NoSuchFieldError -> 0x0040
                r5[r6] = r4     // Catch: NoSuchFieldError -> 0x0040
            L_0x0040:
                androidx.lifecycle.e$a[] r5 = androidx.lifecycle.AbstractC0742e.EnumC0743a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                androidx.lifecycle.C0747h.C0748a.f2820a = r5
                int[] r5 = androidx.lifecycle.C0747h.C0748a.f2820a     // Catch: NoSuchFieldError -> 0x0053
                androidx.lifecycle.e$a r6 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_CREATE     // Catch: NoSuchFieldError -> 0x0053
                int r6 = r6.ordinal()     // Catch: NoSuchFieldError -> 0x0053
                r5[r6] = r0     // Catch: NoSuchFieldError -> 0x0053
            L_0x0053:
                int[] r0 = androidx.lifecycle.C0747h.C0748a.f2820a     // Catch: NoSuchFieldError -> 0x005d
                androidx.lifecycle.e$a r5 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_STOP     // Catch: NoSuchFieldError -> 0x005d
                int r5 = r5.ordinal()     // Catch: NoSuchFieldError -> 0x005d
                r0[r5] = r1     // Catch: NoSuchFieldError -> 0x005d
            L_0x005d:
                int[] r0 = androidx.lifecycle.C0747h.C0748a.f2820a     // Catch: NoSuchFieldError -> 0x0067
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_START     // Catch: NoSuchFieldError -> 0x0067
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x0067
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x0067
            L_0x0067:
                int[] r0 = androidx.lifecycle.C0747h.C0748a.f2820a     // Catch: NoSuchFieldError -> 0x0071
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_PAUSE     // Catch: NoSuchFieldError -> 0x0071
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x0071
                r0[r1] = r3     // Catch: NoSuchFieldError -> 0x0071
            L_0x0071:
                int[] r0 = androidx.lifecycle.C0747h.C0748a.f2820a     // Catch: NoSuchFieldError -> 0x007b
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_RESUME     // Catch: NoSuchFieldError -> 0x007b
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x007b
                r0[r1] = r4     // Catch: NoSuchFieldError -> 0x007b
            L_0x007b:
                int[] r0 = androidx.lifecycle.C0747h.C0748a.f2820a     // Catch: NoSuchFieldError -> 0x0086
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_DESTROY     // Catch: NoSuchFieldError -> 0x0086
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x0086
                r2 = 6
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x0086
            L_0x0086:
                int[] r0 = androidx.lifecycle.C0747h.C0748a.f2820a     // Catch: NoSuchFieldError -> 0x0091
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_ANY     // Catch: NoSuchFieldError -> 0x0091
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x0091
                r2 = 7
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x0091
            L_0x0091:
                return
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    /* loaded from: classes.dex */
    static class C0749b {

        /* renamed from: a */
        androidx.lifecycle.AbstractC0742e.EnumC0744b f2822a;

        /* renamed from: b */
        androidx.lifecycle.AbstractC0741d f2823b;

        C0749b(androidx.lifecycle.AbstractC0745f r1, androidx.lifecycle.AbstractC0742e.EnumC0744b r2) {
                r0 = this;
                r0.<init>()
                androidx.lifecycle.d r1 = androidx.lifecycle.C0751j.m1366a(r1)
                r0.f2823b = r1
                r0.f2822a = r2
                return
        }

        /* renamed from: a */
        void m1369a(androidx.lifecycle.AbstractC0746g r3, androidx.lifecycle.AbstractC0742e.EnumC0743a r4) {
                r2 = this;
                androidx.lifecycle.e$b r0 = androidx.lifecycle.C0747h.m1379b(r4)
                androidx.lifecycle.e$b r1 = r2.f2822a
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0747h.m1383a(r1, r0)
                r2.f2822a = r1
                androidx.lifecycle.d r1 = r2.f2823b
                r1.mo1388a(r3, r4)
                r2.f2822a = r0
                return
        }
    }

    public C0747h(androidx.lifecycle.AbstractC0746g r2) {
            r1 = this;
            r1.<init>()
            a.b.a.b.a r0 = new a.b.a.b.a
            r0.<init>()
            r1.f2813a = r0
            r0 = 0
            r1.f2816d = r0
            r1.f2817e = r0
            r1.f2818f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2819g = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f2815c = r0
            androidx.lifecycle.e$b r2 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2808c
            r1.f2814b = r2
            return
    }

    /* renamed from: a */
    static androidx.lifecycle.AbstractC0742e.EnumC0744b m1383a(androidx.lifecycle.AbstractC0742e.EnumC0744b r1, androidx.lifecycle.AbstractC0742e.EnumC0744b r2) {
            if (r2 == 0) goto L_0x0009
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L_0x0009
            r1 = r2
        L_0x0009:
            return r1
    }

    /* renamed from: a */
    private void m1381a(androidx.lifecycle.AbstractC0746g r6) {
            r5 = this;
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r0 = r5.f2813a
            java.util.Iterator r0 = r0.m4143a()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004a
            boolean r1 = r5.f2818f
            if (r1 != 0) goto L_0x004a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.lifecycle.h$b r2 = (androidx.lifecycle.C0747h.C0749b) r2
        L_0x001c:
            androidx.lifecycle.e$b r3 = r2.f2822a
            androidx.lifecycle.e$b r4 = r5.f2814b
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L_0x0006
            boolean r3 = r5.f2818f
            if (r3 != 0) goto L_0x0006
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r3 = r5.f2813a
            java.lang.Object r4 = r1.getKey()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0006
            androidx.lifecycle.e$b r3 = r2.f2822a
            androidx.lifecycle.e$a r3 = m1378b(r3)
            androidx.lifecycle.e$b r4 = m1379b(r3)
            r5.m1371d(r4)
            r2.m1369a(r6, r3)
            r5.m1375c()
            goto L_0x001c
        L_0x004a:
            return
    }

    /* renamed from: b */
    private static androidx.lifecycle.AbstractC0742e.EnumC0743a m1378b(androidx.lifecycle.AbstractC0742e.EnumC0744b r3) {
            int[] r0 = androidx.lifecycle.C0747h.C0748a.f2821b
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x003d
            r1 = 2
            if (r0 == r1) goto L_0x003a
            r1 = 3
            if (r0 == r1) goto L_0x0037
            r1 = 4
            if (r0 == r1) goto L_0x0034
            r1 = 5
            if (r0 == r1) goto L_0x002e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x002e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L_0x0034:
            androidx.lifecycle.e$a r3 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_PAUSE
            return r3
        L_0x0037:
            androidx.lifecycle.e$a r3 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_STOP
            return r3
        L_0x003a:
            androidx.lifecycle.e$a r3 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_DESTROY
            return r3
        L_0x003d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    /* renamed from: b */
    static androidx.lifecycle.AbstractC0742e.EnumC0744b m1379b(androidx.lifecycle.AbstractC0742e.EnumC0743a r3) {
            int[] r0 = androidx.lifecycle.C0747h.C0748a.f2820a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x002b;
                case 2: goto L_0x002b;
                case 3: goto L_0x0028;
                case 4: goto L_0x0028;
                case 5: goto L_0x0025;
                case 6: goto L_0x0022;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected event value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0022:
            androidx.lifecycle.e$b r3 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2807b
            return r3
        L_0x0025:
            androidx.lifecycle.e$b r3 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2811f
            return r3
        L_0x0028:
            androidx.lifecycle.e$b r3 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2810e
            return r3
        L_0x002b:
            androidx.lifecycle.e$b r3 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2809d
            return r3
    }

    /* renamed from: b */
    private void m1376b(androidx.lifecycle.AbstractC0746g r6) {
            r5 = this;
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r0 = r5.f2813a
            a.b.a.b.b$d r0 = r0.m4138c()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0048
            boolean r1 = r5.f2818f
            if (r1 != 0) goto L_0x0048
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.lifecycle.h$b r2 = (androidx.lifecycle.C0747h.C0749b) r2
        L_0x001c:
            androidx.lifecycle.e$b r3 = r2.f2822a
            androidx.lifecycle.e$b r4 = r5.f2814b
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L_0x0006
            boolean r3 = r5.f2818f
            if (r3 != 0) goto L_0x0006
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r3 = r5.f2813a
            java.lang.Object r4 = r1.getKey()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0006
            androidx.lifecycle.e$b r3 = r2.f2822a
            r5.m1371d(r3)
            androidx.lifecycle.e$b r3 = r2.f2822a
            androidx.lifecycle.e$a r3 = m1370e(r3)
            r2.m1369a(r6, r3)
            r5.m1375c()
            goto L_0x001c
        L_0x0048:
            return
    }

    /* renamed from: b */
    private boolean m1380b() {
            r3 = this;
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r0 = r3.f2813a
            int r0 = r0.size()
            r1 = 1
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r0 = r3.f2813a
            java.util.Map$Entry r0 = r0.m4140b()
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.h$b r0 = (androidx.lifecycle.C0747h.C0749b) r0
            androidx.lifecycle.e$b r0 = r0.f2822a
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r2 = r3.f2813a
            java.util.Map$Entry r2 = r2.m4137d()
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.h$b r2 = (androidx.lifecycle.C0747h.C0749b) r2
            androidx.lifecycle.e$b r2 = r2.f2822a
            if (r0 != r2) goto L_0x002d
            androidx.lifecycle.e$b r0 = r3.f2814b
            if (r0 != r2) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            return r1
    }

    /* renamed from: c */
    private androidx.lifecycle.AbstractC0742e.EnumC0744b m1373c(androidx.lifecycle.AbstractC0745f r3) {
            r2 = this;
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r0 = r2.f2813a
            java.util.Map$Entry r3 = r0.m4144b(r3)
            r0 = 0
            if (r3 == 0) goto L_0x0012
            java.lang.Object r3 = r3.getValue()
            androidx.lifecycle.h$b r3 = (androidx.lifecycle.C0747h.C0749b) r3
            androidx.lifecycle.e$b r3 = r3.f2822a
            goto L_0x0013
        L_0x0012:
            r3 = r0
        L_0x0013:
            java.util.ArrayList<androidx.lifecycle.e$b> r1 = r2.f2819g
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0029
            java.util.ArrayList<androidx.lifecycle.e$b> r0 = r2.f2819g
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.e$b r0 = (androidx.lifecycle.AbstractC0742e.EnumC0744b) r0
        L_0x0029:
            androidx.lifecycle.e$b r1 = r2.f2814b
            androidx.lifecycle.e$b r3 = m1383a(r1, r3)
            androidx.lifecycle.e$b r3 = m1383a(r3, r0)
            return r3
    }

    /* renamed from: c */
    private void m1375c() {
            r2 = this;
            java.util.ArrayList<androidx.lifecycle.e$b> r0 = r2.f2819g
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return
    }

    /* renamed from: c */
    private void m1374c(androidx.lifecycle.AbstractC0742e.EnumC0744b r2) {
            r1 = this;
            androidx.lifecycle.e$b r0 = r1.f2814b
            if (r0 != r2) goto L_0x0005
            return
        L_0x0005:
            r1.f2814b = r2
            boolean r2 = r1.f2817e
            r0 = 1
            if (r2 != 0) goto L_0x001a
            int r2 = r1.f2816d
            if (r2 == 0) goto L_0x0011
            goto L_0x001a
        L_0x0011:
            r1.f2817e = r0
            r1.m1372d()
            r2 = 0
            r1.f2817e = r2
            return
        L_0x001a:
            r1.f2818f = r0
            return
    }

    /* renamed from: d */
    private void m1372d() {
            r3 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.g> r0 = r3.f2815c
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.g r0 = (androidx.lifecycle.AbstractC0746g) r0
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "LifecycleRegistry"
            java.lang.String r1 = "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it."
            android.util.Log.w(r0, r1)
            return
        L_0x0012:
            boolean r1 = r3.m1380b()
            r2 = 0
            r3.f2818f = r2
            if (r1 != 0) goto L_0x0054
            androidx.lifecycle.e$b r1 = r3.f2814b
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r2 = r3.f2813a
            java.util.Map$Entry r2 = r2.m4140b()
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.h$b r2 = (androidx.lifecycle.C0747h.C0749b) r2
            androidx.lifecycle.e$b r2 = r2.f2822a
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L_0x0034
            r3.m1381a(r0)
        L_0x0034:
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r1 = r3.f2813a
            java.util.Map$Entry r1 = r1.m4137d()
            boolean r2 = r3.f2818f
            if (r2 != 0) goto L_0x0012
            if (r1 == 0) goto L_0x0012
            androidx.lifecycle.e$b r2 = r3.f2814b
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.h$b r1 = (androidx.lifecycle.C0747h.C0749b) r1
            androidx.lifecycle.e$b r1 = r1.f2822a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto L_0x0012
            r3.m1376b(r0)
            goto L_0x0012
        L_0x0054:
            return
    }

    /* renamed from: d */
    private void m1371d(androidx.lifecycle.AbstractC0742e.EnumC0744b r2) {
            r1 = this;
            java.util.ArrayList<androidx.lifecycle.e$b> r0 = r1.f2819g
            r0.add(r2)
            return
    }

    /* renamed from: e */
    private static androidx.lifecycle.AbstractC0742e.EnumC0743a m1370e(androidx.lifecycle.AbstractC0742e.EnumC0744b r3) {
            int[] r0 = androidx.lifecycle.C0747h.C0748a.f2821b
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x003b
            r1 = 2
            if (r0 == r1) goto L_0x0038
            r1 = 3
            if (r0 == r1) goto L_0x0035
            r1 = 4
            if (r0 == r1) goto L_0x002f
            r1 = 5
            if (r0 != r1) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x002f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L_0x0035:
            androidx.lifecycle.e$a r3 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_RESUME
            return r3
        L_0x0038:
            androidx.lifecycle.e$a r3 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_START
            return r3
        L_0x003b:
            androidx.lifecycle.e$a r3 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_CREATE
            return r3
    }

    @Override // androidx.lifecycle.AbstractC0742e
    /* renamed from: a */
    public androidx.lifecycle.AbstractC0742e.EnumC0744b mo1386a() {
            r1 = this;
            androidx.lifecycle.e$b r0 = r1.f2814b
            return r0
    }

    /* renamed from: a */
    public void m1385a(androidx.lifecycle.AbstractC0742e.EnumC0743a r1) {
            r0 = this;
            androidx.lifecycle.e$b r1 = m1379b(r1)
            r0.m1374c(r1)
            return
    }

    /* renamed from: a */
    public void m1384a(androidx.lifecycle.AbstractC0742e.EnumC0744b r1) {
            r0 = this;
            r0.m1374c(r1)
            return
    }

    @Override // androidx.lifecycle.AbstractC0742e
    /* renamed from: a */
    public void mo1382a(androidx.lifecycle.AbstractC0745f r7) {
            r6 = this;
            androidx.lifecycle.e$b r0 = r6.f2814b
            androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2807b
            if (r0 != r1) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2808c
        L_0x0009:
            androidx.lifecycle.h$b r0 = new androidx.lifecycle.h$b
            r0.<init>(r7, r1)
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r1 = r6.f2813a
            java.lang.Object r1 = r1.mo4139b(r7, r0)
            androidx.lifecycle.h$b r1 = (androidx.lifecycle.C0747h.C0749b) r1
            if (r1 == 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.ref.WeakReference<androidx.lifecycle.g> r1 = r6.f2815c
            java.lang.Object r1 = r1.get()
            androidx.lifecycle.g r1 = (androidx.lifecycle.AbstractC0746g) r1
            if (r1 != 0) goto L_0x0024
            return
        L_0x0024:
            int r2 = r6.f2816d
            r3 = 1
            if (r2 != 0) goto L_0x0030
            boolean r2 = r6.f2817e
            if (r2 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = 0
            goto L_0x0031
        L_0x0030:
            r2 = 1
        L_0x0031:
            androidx.lifecycle.e$b r4 = r6.m1373c(r7)
            int r5 = r6.f2816d
            int r5 = r5 + r3
            r6.f2816d = r5
        L_0x003a:
            androidx.lifecycle.e$b r5 = r0.f2822a
            int r4 = r5.compareTo(r4)
            if (r4 >= 0) goto L_0x0060
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r4 = r6.f2813a
            boolean r4 = r4.contains(r7)
            if (r4 == 0) goto L_0x0060
            androidx.lifecycle.e$b r4 = r0.f2822a
            r6.m1371d(r4)
            androidx.lifecycle.e$b r4 = r0.f2822a
            androidx.lifecycle.e$a r4 = m1370e(r4)
            r0.m1369a(r1, r4)
            r6.m1375c()
            androidx.lifecycle.e$b r4 = r6.m1373c(r7)
            goto L_0x003a
        L_0x0060:
            if (r2 != 0) goto L_0x0065
            r6.m1372d()
        L_0x0065:
            int r7 = r6.f2816d
            int r7 = r7 - r3
            r6.f2816d = r7
            return
    }

    @Override // androidx.lifecycle.AbstractC0742e
    /* renamed from: b */
    public void mo1377b(androidx.lifecycle.AbstractC0745f r2) {
            r1 = this;
            a.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> r0 = r1.f2813a
            r0.remove(r2)
            return
    }
}
