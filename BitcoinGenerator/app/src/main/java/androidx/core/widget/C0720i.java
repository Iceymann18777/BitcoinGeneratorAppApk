package androidx.core.widget;

/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public final class C0720i {

    /* renamed from: androidx.core.widget.i$a */
    /* loaded from: classes.dex */
    private static class ActionMode$CallbackC0721a implements android.view.ActionMode.Callback {

        /* renamed from: a */
        private final android.view.ActionMode.Callback f2716a;

        /* renamed from: b */
        private final android.widget.TextView f2717b;

        /* renamed from: c */
        private java.lang.Class f2718c;

        /* renamed from: d */
        private java.lang.reflect.Method f2719d;

        /* renamed from: e */
        private boolean f2720e;

        /* renamed from: f */
        private boolean f2721f;

        ActionMode$CallbackC0721a(android.view.ActionMode.Callback r1, android.widget.TextView r2) {
                r0 = this;
                r0.<init>()
                r0.f2716a = r1
                r0.f2717b = r2
                r1 = 0
                r0.f2721f = r1
                return
        }

        /* renamed from: a */
        private android.content.Intent m1484a() {
                r2 = this;
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r0 = r0.setAction(r1)
                java.lang.String r1 = "text/plain"
                android.content.Intent r0 = r0.setType(r1)
                return r0
        }

        /* renamed from: a */
        private android.content.Intent m1481a(android.content.pm.ResolveInfo r3, android.widget.TextView r4) {
                r2 = this;
                android.content.Intent r0 = r2.m1484a()
                boolean r4 = r2.m1479a(r4)
                r4 = r4 ^ 1
                java.lang.String r1 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r4 = r0.putExtra(r1, r4)
                android.content.pm.ActivityInfo r0 = r3.activityInfo
                java.lang.String r0 = r0.packageName
                android.content.pm.ActivityInfo r3 = r3.activityInfo
                java.lang.String r3 = r3.name
                android.content.Intent r3 = r4.setClassName(r0, r3)
                return r3
        }

        /* renamed from: a */
        private java.util.List<android.content.pm.ResolveInfo> m1483a(android.content.Context r4, android.content.pm.PackageManager r5) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                boolean r1 = r4 instanceof android.app.Activity
                if (r1 != 0) goto L_0x000a
                return r0
            L_0x000a:
                android.content.Intent r1 = r3.m1484a()
                r2 = 0
                java.util.List r5 = r5.queryIntentActivities(r1, r2)
                java.util.Iterator r5 = r5.iterator()
            L_0x0017:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x002d
                java.lang.Object r1 = r5.next()
                android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
                boolean r2 = r3.m1482a(r1, r4)
                if (r2 == 0) goto L_0x0017
                r0.add(r1)
                goto L_0x0017
            L_0x002d:
                return r0
        }

        /* renamed from: a */
        private void m1480a(android.view.Menu r9) {
                r8 = this;
                android.widget.TextView r0 = r8.f2717b
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r8.f2721f
                java.lang.String r3 = "removeItemAt"
                r4 = 0
                r5 = 1
                if (r2 != 0) goto L_0x0034
                r8.f2721f = r5
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: ClassNotFoundException | NoSuchMethodException -> 0x002d
                r8.f2718c = r2     // Catch: ClassNotFoundException | NoSuchMethodException -> 0x002d
                java.lang.Class r2 = r8.f2718c     // Catch: ClassNotFoundException | NoSuchMethodException -> 0x002d
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: ClassNotFoundException | NoSuchMethodException -> 0x002d
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: ClassNotFoundException | NoSuchMethodException -> 0x002d
                r6[r4] = r7     // Catch: ClassNotFoundException | NoSuchMethodException -> 0x002d
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: ClassNotFoundException | NoSuchMethodException -> 0x002d
                r8.f2719d = r2     // Catch: ClassNotFoundException | NoSuchMethodException -> 0x002d
                r8.f2720e = r5     // Catch: ClassNotFoundException | NoSuchMethodException -> 0x002d
                goto L_0x0034
            L_0x002d:
                r2 = 0
                r8.f2718c = r2
                r8.f2719d = r2
                r8.f2720e = r4
            L_0x0034:
                boolean r2 = r8.f2720e     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                if (r2 == 0) goto L_0x0043
                java.lang.Class r2 = r8.f2718c     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                boolean r2 = r2.isInstance(r9)     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                if (r2 == 0) goto L_0x0043
                java.lang.reflect.Method r2 = r8.f2719d     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                goto L_0x0051
            L_0x0043:
                java.lang.Class r2 = r9.getClass()     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                r6[r4] = r7     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
            L_0x0051:
                int r3 = r9.size()     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                int r3 = r3 - r5
            L_0x0056:
                if (r3 < 0) goto L_0x0080
                android.view.MenuItem r6 = r9.getItem(r3)     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                android.content.Intent r7 = r6.getIntent()     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                if (r7 == 0) goto L_0x007d
                java.lang.String r7 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r6 = r6.getIntent()     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                java.lang.String r6 = r6.getAction()     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                boolean r6 = r7.equals(r6)     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                if (r6 == 0) goto L_0x007d
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                r6[r4] = r7     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
                r2.invoke(r9, r6)     // Catch: NoSuchMethodException | IllegalAccessException | InvocationTargetException -> 0x00ab
            L_0x007d:
                int r3 = r3 + (-1)
                goto L_0x0056
            L_0x0080:
                java.util.List r0 = r8.m1483a(r0, r1)
                r2 = 0
            L_0x0085:
                int r3 = r0.size()
                if (r2 >= r3) goto L_0x00ab
                java.lang.Object r3 = r0.get(r2)
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                int r6 = r2 + 100
                java.lang.CharSequence r7 = r3.loadLabel(r1)
                android.view.MenuItem r6 = r9.add(r4, r4, r6, r7)
                android.widget.TextView r7 = r8.f2717b
                android.content.Intent r3 = r8.m1481a(r3, r7)
                android.view.MenuItem r3 = r6.setIntent(r3)
                r3.setShowAsAction(r5)
                int r2 = r2 + 1
                goto L_0x0085
            L_0x00ab:
                return
        }

        /* renamed from: a */
        private boolean m1482a(android.content.pm.ResolveInfo r4, android.content.Context r5) {
                r3 = this;
                java.lang.String r0 = r5.getPackageName()
                android.content.pm.ActivityInfo r1 = r4.activityInfo
                java.lang.String r1 = r1.packageName
                boolean r0 = r0.equals(r1)
                r1 = 1
                if (r0 == 0) goto L_0x0010
                return r1
            L_0x0010:
                android.content.pm.ActivityInfo r0 = r4.activityInfo
                boolean r0 = r0.exported
                r2 = 0
                if (r0 != 0) goto L_0x0018
                return r2
            L_0x0018:
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                java.lang.String r4 = r4.permission
                if (r4 == 0) goto L_0x0026
                int r4 = r5.checkSelfPermission(r4)
                if (r4 != 0) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r1 = 0
            L_0x0026:
                return r1
        }

        /* renamed from: a */
        private boolean m1479a(android.widget.TextView r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.text.Editable
                if (r0 == 0) goto L_0x0012
                boolean r0 = r2.onCheckIsTextEditor()
                if (r0 == 0) goto L_0x0012
                boolean r2 = r2.isEnabled()
                if (r2 == 0) goto L_0x0012
                r2 = 1
                goto L_0x0013
            L_0x0012:
                r2 = 0
            L_0x0013:
                return r2
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(android.view.ActionMode r2, android.view.MenuItem r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f2716a
                boolean r2 = r0.onActionItemClicked(r2, r3)
                return r2
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(android.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f2716a
                boolean r2 = r0.onCreateActionMode(r2, r3)
                return r2
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(android.view.ActionMode r2) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f2716a
                r0.onDestroyActionMode(r2)
                return
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(android.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                r1.m1480a(r3)
                android.view.ActionMode$Callback r0 = r1.f2716a
                boolean r2 = r0.onPrepareActionMode(r2, r3)
                return r2
        }
    }

    /* renamed from: a */
    private static int m1497a(android.text.TextDirectionHeuristic r2) {
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            r1 = 1
            if (r2 != r0) goto L_0x0006
            return r1
        L_0x0006:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r2 != r0) goto L_0x000b
            return r1
        L_0x000b:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r2 != r0) goto L_0x0011
            r2 = 2
            return r2
        L_0x0011:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            if (r2 != r0) goto L_0x0017
            r2 = 3
            return r2
        L_0x0017:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            if (r2 != r0) goto L_0x001d
            r2 = 4
            return r2
        L_0x001d:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            if (r2 != r0) goto L_0x0023
            r2 = 5
            return r2
        L_0x0023:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r2 != r0) goto L_0x0029
            r2 = 6
            return r2
        L_0x0029:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r2 != r0) goto L_0x002f
            r2 = 7
            return r2
        L_0x002f:
            return r1
    }

    /* renamed from: a */
    public static int m1496a(android.widget.TextView r1) {
            int r0 = r1.getPaddingTop()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    /* renamed from: a */
    public static android.view.ActionMode.Callback m1491a(android.widget.TextView r2, android.view.ActionMode.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0015
            r1 = 27
            if (r0 > r1) goto L_0x0015
            boolean r0 = r3 instanceof androidx.core.widget.C0720i.ActionMode$CallbackC0721a
            if (r0 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            androidx.core.widget.i$a r0 = new androidx.core.widget.i$a
            r0.<init>(r3, r2)
            return r0
        L_0x0015:
            return r3
    }

    /* renamed from: a */
    public static void m1495a(android.widget.TextView r3, int r4) {
            p000a.p018g.p028k.C0184g.m3557a(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000d
            r3.setFirstBaselineToTopHeight(r4)
            return
        L_0x000d:
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x0025
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            int r0 = r0.ascent
            goto L_0x0027
        L_0x0025:
            int r0 = r0.top
        L_0x0027:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L_0x003e
            int r0 = -r0
            int r4 = r4 - r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r0, r4, r1, r2)
        L_0x003e:
            return
    }

    /* renamed from: a */
    public static void m1494a(android.widget.TextView r2, p000a.p018g.p027j.C0175a.C0176a r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x0011
            android.text.TextDirectionHeuristic r0 = r3.m3570c()
            int r0 = m1497a(r0)
            r2.setTextDirection(r0)
        L_0x0011:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L_0x0040
            android.text.TextPaint r0 = r3.m3569d()
            float r0 = r0.getTextScaleX()
            android.text.TextPaint r1 = r2.getPaint()
            android.text.TextPaint r3 = r3.m3569d()
            r1.set(r3)
            float r3 = r2.getTextScaleX()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x003c
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r1
            r2.setTextScaleX(r3)
        L_0x003c:
            r2.setTextScaleX(r0)
            goto L_0x0059
        L_0x0040:
            android.text.TextPaint r0 = r2.getPaint()
            android.text.TextPaint r1 = r3.m3569d()
            r0.set(r1)
            int r0 = r3.m3572a()
            r2.setBreakStrategy(r0)
            int r3 = r3.m3571b()
            r2.setHyphenationFrequency(r3)
        L_0x0059:
            return
    }

    /* renamed from: a */
    public static void m1493a(android.widget.TextView r2, p000a.p018g.p027j.C0175a r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000e
            android.text.PrecomputedText r3 = r3.m3573b()
        L_0x000a:
            r2.setText(r3)
            goto L_0x001d
        L_0x000e:
            a.g.j.a$a r0 = m1486d(r2)
            a.g.j.a$a r1 = r3.m3574a()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001e
            goto L_0x000a
        L_0x001d:
            return
        L_0x001e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Given text can not be applied to TextView."
            r2.<init>(r3)
            goto L_0x0027
        L_0x0026:
            throw r2
        L_0x0027:
            goto L_0x0026
    }

    /* renamed from: a */
    public static void m1492a(android.widget.TextView r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4, android.graphics.drawable.Drawable r5, android.graphics.drawable.Drawable r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x000a
            r2.setCompoundDrawablesRelative(r3, r4, r5, r6)
            goto L_0x0027
        L_0x000a:
            r1 = 17
            if (r0 < r1) goto L_0x0024
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x001b
            r0 = r5
            goto L_0x001c
        L_0x001b:
            r0 = r3
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r3 = r5
        L_0x0020:
            r2.setCompoundDrawables(r0, r4, r3, r6)
            goto L_0x0027
        L_0x0024:
            r2.setCompoundDrawables(r3, r4, r5, r6)
        L_0x0027:
            return
    }

    /* renamed from: b */
    public static int m1490b(android.widget.TextView r1) {
            int r0 = r1.getPaddingBottom()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: b */
    public static void m1489b(android.widget.TextView r3, int r4) {
            p000a.p018g.p028k.C0184g.m3557a(r4)
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x001b
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            int r0 = r0.descent
            goto L_0x001d
        L_0x001b:
            int r0 = r0.bottom
        L_0x001d:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L_0x0033
            int r4 = r4 - r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
        L_0x0033:
            return
    }

    /* renamed from: c */
    private static android.text.TextDirectionHeuristic m1488c(android.widget.TextView r4) {
            android.text.method.TransformationMethod r0 = r4.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto L_0x000b
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        L_0x000b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L_0x003e
            int r0 = r4.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L_0x003e
            java.util.Locale r4 = r4.getTextLocale()
            android.icu.text.DecimalFormatSymbols r4 = android.icu.text.DecimalFormatSymbols.getInstance(r4)
            java.lang.String[] r4 = r4.getDigitStrings()
            r4 = r4[r2]
            int r4 = r4.codePointAt(r2)
            byte r4 = java.lang.Character.getDirectionality(r4)
            if (r4 == r3) goto L_0x003b
            r0 = 2
            if (r4 != r0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        L_0x003b:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            return r4
        L_0x003e:
            int r0 = r4.getLayoutDirection()
            if (r0 != r3) goto L_0x0045
            r2 = 1
        L_0x0045:
            int r4 = r4.getTextDirection()
            switch(r4) {
                case 2: goto L_0x0060;
                case 3: goto L_0x005d;
                case 4: goto L_0x005a;
                case 5: goto L_0x0057;
                case 6: goto L_0x0054;
                case 7: goto L_0x0051;
                default: goto L_0x004c;
            }
        L_0x004c:
            if (r2 == 0) goto L_0x0063
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0065
        L_0x0051:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            return r4
        L_0x0054:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            return r4
        L_0x0057:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LOCALE
            return r4
        L_0x005a:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            return r4
        L_0x005d:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        L_0x0060:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            return r4
        L_0x0063:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L_0x0065:
            return r4
    }

    /* renamed from: c */
    public static void m1487c(android.widget.TextView r2, int r3) {
            p000a.p018g.p028k.C0184g.m3557a(r3)
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L_0x0015
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L_0x0015:
            return
    }

    /* renamed from: d */
    public static p000a.p018g.p027j.C0175a.C0176a m1486d(android.widget.TextView r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            a.g.j.a$a r0 = new a.g.j.a$a
            android.text.PrecomputedText$Params r3 = r3.getTextMetricsParams()
            r0.<init>(r3)
            return r0
        L_0x0010:
            a.g.j.a$a$a r0 = new a.g.j.a$a$a
            android.text.TextPaint r1 = new android.text.TextPaint
            android.text.TextPaint r2 = r3.getPaint()
            r1.<init>(r2)
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0032
            int r1 = r3.getBreakStrategy()
            r0.m3567a(r1)
            int r1 = r3.getHyphenationFrequency()
            r0.m3565b(r1)
        L_0x0032:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 < r2) goto L_0x003f
            android.text.TextDirectionHeuristic r3 = m1488c(r3)
            r0.m3566a(r3)
        L_0x003f:
            a.g.j.a$a r3 = r0.m3568a()
            return r3
    }

    /* renamed from: d */
    public static void m1485d(android.widget.TextView r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000a
            r2.setTextAppearance(r3)
            goto L_0x0011
        L_0x000a:
            android.content.Context r0 = r2.getContext()
            r2.setTextAppearance(r0, r3)
        L_0x0011:
            return
    }
}
