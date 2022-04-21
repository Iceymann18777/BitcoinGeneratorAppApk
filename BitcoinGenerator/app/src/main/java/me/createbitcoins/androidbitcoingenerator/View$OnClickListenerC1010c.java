package me.createbitcoins.androidbitcoingenerator;

/* renamed from: me.createbitcoins.androidbitcoingenerator.c */
/* loaded from: classes.dex */
public class View$OnClickListenerC1010c extends p000a.p036j.p037a.ComponentCallbacksC0248c implements android.view.View.OnClickListener {

    /* renamed from: i0 */
    private static me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c f3667i0;

    /* renamed from: Z */
    final android.os.Handler f3668Z;

    /* renamed from: a0 */
    android.widget.ProgressBar f3669a0;

    /* renamed from: b0 */
    android.app.ProgressDialog f3670b0;

    /* renamed from: c0 */
    android.widget.TextView f3671c0;

    /* renamed from: d0 */
    android.widget.TextView f3672d0;

    /* renamed from: e0 */
    android.widget.EditText f3673e0;

    /* renamed from: f0 */
    me.createbitcoins.androidbitcoingenerator.C1038d f3674f0;

    /* renamed from: g0 */
    private java.lang.Runnable f3675g0;

    /* renamed from: h0 */
    private java.lang.Runnable f3676h0;

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$a */
    /* loaded from: classes.dex */
    class RunnableC1011a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ java.lang.String f3677b;

        /* renamed from: c */
        final /* synthetic */ int f3678c;

        /* renamed from: d */
        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c f3679d;

        RunnableC1011a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.f3679d = r1
                r0.f3677b = r2
                r0.f3678c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                me.createbitcoins.androidbitcoingenerator.c r0 = r2.f3679d
                android.view.View r0 = r0.m3183y()
                r1 = 2131296356(0x7f090064, float:1.8210626E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r1 = r2.f3677b
                r0.setText(r1)
                int r1 = r2.f3678c
                r0.setTextColor(r1)
                return
        }
    }

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$b */
    /* loaded from: classes.dex */
    class DialogInterface$OnClickListenerC1012b implements android.content.DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c f3680b;

        DialogInterface$OnClickListenerC1012b(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r1) {
                r0 = this;
                r0.f3680b = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                me.createbitcoins.androidbitcoingenerator.c r1 = r0.f3680b
                me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.m9a(r1)
                return
        }
    }

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$c */
    /* loaded from: classes.dex */
    class DialogInterface$OnClickListenerC1013c implements android.content.DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c f3681b;

        DialogInterface$OnClickListenerC1013c(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r1) {
                r0 = this;
                r0.f3681b = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                me.createbitcoins.androidbitcoingenerator.c r1 = r0.f3681b
                a.j.a.d r1 = r1.m3219d()
                r2 = 1
                r1.moveTaskToBack(r2)
                int r1 = android.os.Process.myPid()
                android.os.Process.killProcess(r1)
                java.lang.System.exit(r2)
                return
        }
    }

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$d */
    /* loaded from: classes.dex */
    class DialogInterface$OnClickListenerC1014d implements android.content.DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c f3682b;

        DialogInterface$OnClickListenerC1014d(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r1) {
                r0 = this;
                r0.f3682b = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                me.createbitcoins.androidbitcoingenerator.c r2 = r1.f3682b
                a.j.a.h r2 = r2.m3193o()
                a.j.a.m r2 = r2.mo3111a()
                me.createbitcoins.androidbitcoingenerator.b r3 = new me.createbitcoins.androidbitcoingenerator.b
                r3.<init>()
                r0 = 2131296343(0x7f090057, float:1.82106E38)
                r2.mo2993a(r0, r3)
                r2.mo2994a()
                return
        }
    }

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$e */
    /* loaded from: classes.dex */
    class RunnableC1015e implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c f3683b;

        RunnableC1015e(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r1) {
                r0 = this;
                r0.f3683b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                me.createbitcoins.androidbitcoingenerator.c r0 = r2.f3683b
                android.widget.ProgressBar r0 = r0.f3669a0
                r1 = 75
                r0.setProgress(r1)
                me.createbitcoins.androidbitcoingenerator.c r0 = r2.f3683b
                me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.m6b(r0)
                return
        }
    }

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f */
    /* loaded from: classes.dex */
    class RunnableC1016f implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c f3684b;

        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a */
        /* loaded from: classes.dex */
        class RunnableC1017a implements java.lang.Runnable {

            /* renamed from: b */
            final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f f3685b;

            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a */
            /* loaded from: classes.dex */
            class RunnableC1018a implements java.lang.Runnable {

                /* renamed from: b */
                final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a f3686b;

                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a */
                /* loaded from: classes.dex */
                class RunnableC1019a implements java.lang.Runnable {

                    /* renamed from: b */
                    final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a f3687b;

                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a */
                    /* loaded from: classes.dex */
                    class RunnableC1020a implements java.lang.Runnable {

                        /* renamed from: b */
                        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a f3688b;

                        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a */
                        /* loaded from: classes.dex */
                        class RunnableC1021a implements java.lang.Runnable {

                            /* renamed from: b */
                            final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a f3689b;

                            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a */
                            /* loaded from: classes.dex */
                            class RunnableC1022a implements java.lang.Runnable {

                                /* renamed from: b */
                                final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a f3690b;

                                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a */
                                /* loaded from: classes.dex */
                                class RunnableC1023a implements java.lang.Runnable {

                                    /* renamed from: b */
                                    final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a f3691b;

                                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a */
                                    /* loaded from: classes.dex */
                                    class RunnableC1024a implements java.lang.Runnable {

                                        /* renamed from: b */
                                        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a f3692b;

                                        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a */
                                        /* loaded from: classes.dex */
                                        class RunnableC1025a implements java.lang.Runnable {

                                            /* renamed from: b */
                                            final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a f3693b;

                                            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a */
                                            /* loaded from: classes.dex */
                                            class RunnableC1026a implements java.lang.Runnable {

                                                /* renamed from: b */
                                                final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a f3694b;

                                                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a */
                                                /* loaded from: classes.dex */
                                                class RunnableC1027a implements java.lang.Runnable {

                                                    /* renamed from: b */
                                                    final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a f3695b;

                                                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a */
                                                    /* loaded from: classes.dex */
                                                    class RunnableC1028a implements java.lang.Runnable {

                                                        /* renamed from: b */
                                                        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a f3696b;

                                                        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                        /* loaded from: classes.dex */
                                                        class RunnableC1029a implements java.lang.Runnable {

                                                            /* renamed from: b */
                                                            final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a f3697b;

                                                            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                            /* loaded from: classes.dex */
                                                            class RunnableC1030a implements java.lang.Runnable {

                                                                /* renamed from: b */
                                                                final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a f3698b;

                                                                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                /* loaded from: classes.dex */
                                                                class RunnableC1031a implements java.lang.Runnable {

                                                                    /* renamed from: b */
                                                                    final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a f3699b;

                                                                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                    /* loaded from: classes.dex */
                                                                    class RunnableC1032a implements java.lang.Runnable {

                                                                        /* renamed from: b */
                                                                        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a f3700b;

                                                                        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                        /* loaded from: classes.dex */
                                                                        class RunnableC1033a implements java.lang.Runnable {

                                                                            /* renamed from: b */
                                                                            final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a.RunnableC1032a f3701b;

                                                                            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                            /* loaded from: classes.dex */
                                                                            class RunnableC1034a implements java.lang.Runnable {

                                                                                /* renamed from: b */
                                                                                final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a.RunnableC1032a.RunnableC1033a f3702b;

                                                                                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                                /* loaded from: classes.dex */
                                                                                class RunnableC1035a implements java.lang.Runnable {

                                                                                    /* renamed from: b */
                                                                                    final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a.RunnableC1032a.RunnableC1033a.RunnableC1034a f3703b;

                                                                                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                                    /* loaded from: classes.dex */
                                                                                    class RunnableC1036a implements java.lang.Runnable {

                                                                                        /* renamed from: b */
                                                                                        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a.RunnableC1032a.RunnableC1033a.RunnableC1034a.RunnableC1035a f3704b;

                                                                                        RunnableC1036a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a.RunnableC1032a.RunnableC1033a.RunnableC1034a.RunnableC1035a r1) {
                                                                                                r0 = this;
                                                                                                r0.f3704b = r1
                                                                                                r0.<init>()
                                                                                                return
                                                                                        }

                                                                                        @Override // java.lang.Runnable
                                                                                        public void run() {
                                                                                                r4 = this;
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3704b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3703b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3702b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3701b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                                android.widget.ProgressBar r0 = r0.f3669a0
                                                                                                r1 = 73
                                                                                                r0.setProgress(r1)
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3704b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3703b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3702b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3701b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                                android.widget.TextView r0 = r0.f3672d0
                                                                                                java.lang.String r1 = "Payment Verification Failed!!!"
                                                                                                r0.setText(r1)
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3704b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3703b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3702b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3701b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                                android.os.Handler r1 = r0.f3668Z
                                                                                                java.lang.Runnable r0 = me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.m4c(r0)
                                                                                                r2 = 2000(0x7d0, double:9.88E-321)
                                                                                                r1.postDelayed(r0, r2)
                                                                                                return
                                                                                        }
                                                                                    }

                                                                                    RunnableC1035a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a.RunnableC1032a.RunnableC1033a.RunnableC1034a r1) {
                                                                                            r0 = this;
                                                                                            r0.f3703b = r1
                                                                                            r0.<init>()
                                                                                            return
                                                                                    }

                                                                                    @Override // java.lang.Runnable
                                                                                    public void run() {
                                                                                            r4 = this;
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3703b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3702b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3701b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                            android.widget.ProgressBar r0 = r0.f3669a0
                                                                                            r1 = 70
                                                                                            r0.setProgress(r1)
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3703b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3702b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3701b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                            android.widget.TextView r0 = r0.f3672d0
                                                                                            java.lang.String r1 = "Verifying Your Subscription..."
                                                                                            r0.setText(r1)
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3703b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3702b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3701b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                            android.os.Handler r0 = r0.f3668Z
                                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a
                                                                                            r1.<init>(r4)
                                                                                            r2 = 1000(0x3e8, double:4.94E-321)
                                                                                            r0.postDelayed(r1, r2)
                                                                                            return
                                                                                    }
                                                                                }

                                                                                RunnableC1034a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a.RunnableC1032a.RunnableC1033a r1) {
                                                                                        r0 = this;
                                                                                        r0.f3702b = r1
                                                                                        r0.<init>()
                                                                                        return
                                                                                }

                                                                                @Override // java.lang.Runnable
                                                                                public void run() {
                                                                                        r4 = this;
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3702b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3701b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                        android.widget.ProgressBar r0 = r0.f3669a0
                                                                                        r1 = 69
                                                                                        r0.setProgress(r1)
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3702b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3701b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                        android.widget.TextView r0 = r0.f3672d0
                                                                                        java.lang.String r1 = "Verifying Your Subscription.."
                                                                                        r0.setText(r1)
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3702b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3701b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                        android.os.Handler r0 = r0.f3668Z
                                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a
                                                                                        r1.<init>(r4)
                                                                                        r2 = 1000(0x3e8, double:4.94E-321)
                                                                                        r0.postDelayed(r1, r2)
                                                                                        return
                                                                                }
                                                                            }

                                                                            RunnableC1033a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a.RunnableC1032a r1) {
                                                                                    r0 = this;
                                                                                    r0.f3701b = r1
                                                                                    r0.<init>()
                                                                                    return
                                                                            }

                                                                            @Override // java.lang.Runnable
                                                                            public void run() {
                                                                                    r4 = this;
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3701b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                    android.widget.ProgressBar r0 = r0.f3669a0
                                                                                    r1 = 68
                                                                                    r0.setProgress(r1)
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3701b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                    android.widget.TextView r0 = r0.f3672d0
                                                                                    java.lang.String r1 = "Verifying Your Subscription."
                                                                                    r0.setText(r1)
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3701b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3700b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                    android.os.Handler r0 = r0.f3668Z
                                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a
                                                                                    r1.<init>(r4)
                                                                                    r2 = 2000(0x7d0, double:9.88E-321)
                                                                                    r0.postDelayed(r1, r2)
                                                                                    return
                                                                            }
                                                                        }

                                                                        RunnableC1032a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a.RunnableC1031a r1) {
                                                                                r0 = this;
                                                                                r0.f3700b = r1
                                                                                r0.<init>()
                                                                                return
                                                                        }

                                                                        @Override // java.lang.Runnable
                                                                        public void run() {
                                                                                r4 = this;
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3700b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                android.widget.ProgressBar r0 = r0.f3669a0
                                                                                r1 = 66
                                                                                r0.setProgress(r1)
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3700b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                android.widget.TextView r0 = r0.f3672d0
                                                                                java.lang.String r1 = "Preparing to broadcast transaction.."
                                                                                r0.setText(r1)
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3700b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3699b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                                android.os.Handler r0 = r0.f3668Z
                                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a
                                                                                r1.<init>(r4)
                                                                                r2 = 1000(0x3e8, double:4.94E-321)
                                                                                r0.postDelayed(r1, r2)
                                                                                return
                                                                        }
                                                                    }

                                                                    RunnableC1031a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a.RunnableC1030a r1) {
                                                                            r0 = this;
                                                                            r0.f3699b = r1
                                                                            r0.<init>()
                                                                            return
                                                                    }

                                                                    @Override // java.lang.Runnable
                                                                    public void run() {
                                                                            r4 = this;
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3699b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                            android.widget.ProgressBar r0 = r0.f3669a0
                                                                            r1 = 65
                                                                            r0.setProgress(r1)
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3699b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                            android.widget.TextView r0 = r0.f3672d0
                                                                            java.lang.String r1 = "Preparing to broadcast transaction."
                                                                            r0.setText(r1)
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3699b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3698b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                            android.os.Handler r0 = r0.f3668Z
                                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a
                                                                            r1.<init>(r4)
                                                                            r2 = 1000(0x3e8, double:4.94E-321)
                                                                            r0.postDelayed(r1, r2)
                                                                            return
                                                                    }
                                                                }

                                                                RunnableC1030a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a.RunnableC1029a r1) {
                                                                        r0 = this;
                                                                        r0.f3698b = r1
                                                                        r0.<init>()
                                                                        return
                                                                }

                                                                @Override // java.lang.Runnable
                                                                public void run() {
                                                                        r4 = this;
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3698b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                        android.widget.ProgressBar r0 = r0.f3669a0
                                                                        r1 = 60
                                                                        r0.setProgress(r1)
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3698b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                        android.widget.TextView r0 = r0.f3672d0
                                                                        java.lang.String r1 = "Preparing to broadcast transaction..."
                                                                        r0.setText(r1)
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3698b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3697b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                        android.os.Handler r0 = r0.f3668Z
                                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a
                                                                        r1.<init>(r4)
                                                                        r2 = 2000(0x7d0, double:9.88E-321)
                                                                        r0.postDelayed(r1, r2)
                                                                        return
                                                                }
                                                            }

                                                            RunnableC1029a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a.RunnableC1028a r1) {
                                                                    r0 = this;
                                                                    r0.f3697b = r1
                                                                    r0.<init>()
                                                                    return
                                                            }

                                                            @Override // java.lang.Runnable
                                                            public void run() {
                                                                    r4 = this;
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3697b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                    android.widget.ProgressBar r0 = r0.f3669a0
                                                                    r1 = 59
                                                                    r0.setProgress(r1)
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3697b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                    android.widget.TextView r0 = r0.f3672d0
                                                                    java.lang.String r1 = "Preparing to broadcast transaction.."
                                                                    r0.setText(r1)
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3697b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r0.f3696b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                    android.os.Handler r0 = r0.f3668Z
                                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a
                                                                    r1.<init>(r4)
                                                                    r2 = 1000(0x3e8, double:4.94E-321)
                                                                    r0.postDelayed(r1, r2)
                                                                    return
                                                            }
                                                        }

                                                        RunnableC1028a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a.RunnableC1027a r1) {
                                                                r0 = this;
                                                                r0.f3696b = r1
                                                                r0.<init>()
                                                                return
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public void run() {
                                                                r4 = this;
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3696b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                android.widget.ProgressBar r0 = r0.f3669a0
                                                                r1 = 59
                                                                r0.setProgress(r1)
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3696b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                android.widget.TextView r0 = r0.f3672d0
                                                                java.lang.String r1 = "Preparing to broadcast transaction."
                                                                r0.setText(r1)
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r0 = r4.f3696b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r0.f3695b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                                android.os.Handler r0 = r0.f3668Z
                                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a
                                                                r1.<init>(r4)
                                                                r2 = 1000(0x3e8, double:4.94E-321)
                                                                r0.postDelayed(r1, r2)
                                                                return
                                                        }
                                                    }

                                                    RunnableC1027a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a.RunnableC1026a r1) {
                                                            r0 = this;
                                                            r0.f3695b = r1
                                                            r0.<init>()
                                                            return
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                            r4 = this;
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r4.f3695b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                            android.widget.ProgressBar r0 = r0.f3669a0
                                                            r1 = 57
                                                            r0.setProgress(r1)
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r4.f3695b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                            android.widget.TextView r0 = r0.f3672d0
                                                            java.lang.String r1 = "Preparing to broadcast transaction..."
                                                            r0.setText(r1)
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r0 = r4.f3695b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r0.f3694b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                            android.os.Handler r0 = r0.f3668Z
                                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a
                                                            r1.<init>(r4)
                                                            r2 = 2000(0x7d0, double:9.88E-321)
                                                            r0.postDelayed(r1, r2)
                                                            return
                                                    }
                                                }

                                                RunnableC1026a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a.RunnableC1025a r1) {
                                                        r0 = this;
                                                        r0.f3694b = r1
                                                        r0.<init>()
                                                        return
                                                }

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                        r4 = this;
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r4.f3694b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                        android.widget.ProgressBar r0 = r0.f3669a0
                                                        r1 = 57
                                                        r0.setProgress(r1)
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r4.f3694b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                        android.widget.TextView r0 = r0.f3672d0
                                                        java.lang.String r1 = "Preparing to broadcast transaction.."
                                                        r0.setText(r1)
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r0 = r4.f3694b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r0.f3693b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                        android.os.Handler r0 = r0.f3668Z
                                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a
                                                        r1.<init>(r4)
                                                        r2 = 1000(0x3e8, double:4.94E-321)
                                                        r0.postDelayed(r1, r2)
                                                        return
                                                }
                                            }

                                            RunnableC1025a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a.RunnableC1024a r1) {
                                                    r0 = this;
                                                    r0.f3693b = r1
                                                    r0.<init>()
                                                    return
                                            }

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                    r4 = this;
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r4.f3693b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                    android.widget.ProgressBar r0 = r0.f3669a0
                                                    r1 = 55
                                                    r0.setProgress(r1)
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r4.f3693b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                    android.widget.TextView r0 = r0.f3672d0
                                                    java.lang.String r1 = "Preparing to broadcast transaction."
                                                    r0.setText(r1)
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r0 = r4.f3693b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r0.f3692b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                    android.os.Handler r0 = r0.f3668Z
                                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a
                                                    r1.<init>(r4)
                                                    r2 = 1000(0x3e8, double:4.94E-321)
                                                    r0.postDelayed(r1, r2)
                                                    return
                                            }
                                        }

                                        RunnableC1024a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a.RunnableC1023a r1) {
                                                r0 = this;
                                                r0.f3692b = r1
                                                r0.<init>()
                                                return
                                        }

                                        @Override // java.lang.Runnable
                                        public void run() {
                                                r4 = this;
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r4.f3692b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                android.widget.ProgressBar r0 = r0.f3669a0
                                                r1 = 52
                                                r0.setProgress(r1)
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r4.f3692b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                android.widget.TextView r0 = r0.f3672d0
                                                java.lang.String r1 = "Looking For Next Probable Block..."
                                                r0.setText(r1)
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r0 = r4.f3692b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r0.f3691b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                                android.os.Handler r0 = r0.f3668Z
                                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a
                                                r1.<init>(r4)
                                                r2 = 1000(0x3e8, double:4.94E-321)
                                                r0.postDelayed(r1, r2)
                                                return
                                        }
                                    }

                                    RunnableC1023a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a.RunnableC1022a r1) {
                                            r0 = this;
                                            r0.f3691b = r1
                                            r0.<init>()
                                            return
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                            r4 = this;
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r4.f3691b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                            android.widget.ProgressBar r0 = r0.f3669a0
                                            r1 = 47
                                            r0.setProgress(r1)
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r4.f3691b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                            android.widget.TextView r0 = r0.f3672d0
                                            java.lang.String r1 = "Transaction Successfully Generated!!"
                                            r0.setText(r1)
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r0 = r4.f3691b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r0.f3690b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                            android.os.Handler r0 = r0.f3668Z
                                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a
                                            r1.<init>(r4)
                                            r2 = 2000(0x7d0, double:9.88E-321)
                                            r0.postDelayed(r1, r2)
                                            return
                                    }
                                }

                                RunnableC1022a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a.RunnableC1021a r1) {
                                        r0 = this;
                                        r0.f3690b = r1
                                        r0.<init>()
                                        return
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                        r4 = this;
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r4.f3690b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                        android.widget.ProgressBar r0 = r0.f3669a0
                                        r1 = 45
                                        r0.setProgress(r1)
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r4.f3690b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                        android.widget.TextView r0 = r0.f3672d0
                                        java.lang.String r1 = "Generating Transaction From Weak Signature.."
                                        r0.setText(r1)
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r0 = r4.f3690b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r0.f3689b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                        android.os.Handler r0 = r0.f3668Z
                                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a
                                        r1.<init>(r4)
                                        r2 = 1000(0x3e8, double:4.94E-321)
                                        r0.postDelayed(r1, r2)
                                        return
                                }
                            }

                            RunnableC1021a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a.RunnableC1020a r1) {
                                    r0 = this;
                                    r0.f3689b = r1
                                    r0.<init>()
                                    return
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                    r4 = this;
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r4.f3689b
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                    android.widget.ProgressBar r0 = r0.f3669a0
                                    r1 = 35
                                    r0.setProgress(r1)
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r4.f3689b
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                    android.widget.TextView r0 = r0.f3672d0
                                    java.lang.String r1 = "Searching For Weak Signatures..."
                                    r0.setText(r1)
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r0 = r4.f3689b
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r0.f3688b
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                    me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                    android.os.Handler r0 = r0.f3668Z
                                    me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a
                                    r1.<init>(r4)
                                    r2 = 1500(0x5dc, double:7.41E-321)
                                    r0.postDelayed(r1, r2)
                                    return
                            }
                        }

                        RunnableC1020a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a.RunnableC1019a r1) {
                                r0 = this;
                                r0.f3688b = r1
                                r0.<init>()
                                return
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                                r4 = this;
                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r4.f3688b
                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                android.widget.ProgressBar r0 = r0.f3669a0
                                r1 = 35
                                r0.setProgress(r1)
                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r4.f3688b
                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                android.widget.TextView r0 = r0.f3672d0
                                java.lang.String r1 = "Searching For Weak Signatures.."
                                r0.setText(r1)
                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r0 = r4.f3688b
                                me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r0.f3687b
                                me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                                me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                                me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                                android.os.Handler r0 = r0.f3668Z
                                me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a
                                r1.<init>(r4)
                                r2 = 1000(0x3e8, double:4.94E-321)
                                r0.postDelayed(r1, r2)
                                return
                        }
                    }

                    RunnableC1019a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a.RunnableC1018a r1) {
                            r0 = this;
                            r0.f3687b = r1
                            r0.<init>()
                            return
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                            r4 = this;
                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r4.f3687b
                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                            android.widget.ProgressBar r0 = r0.f3669a0
                            r1 = 30
                            r0.setProgress(r1)
                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r4.f3687b
                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                            android.widget.TextView r0 = r0.f3672d0
                            java.lang.String r1 = "Searching For Weak Signatures."
                            r0.setText(r1)
                            me.createbitcoins.androidbitcoingenerator.c$f$a$a r0 = r4.f3687b
                            me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r0.f3686b
                            me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                            me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                            android.os.Handler r0 = r0.f3668Z
                            me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a
                            r1.<init>(r4)
                            r2 = 500(0x1f4, double:2.47E-321)
                            r0.postDelayed(r1, r2)
                            return
                    }
                }

                RunnableC1018a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f.RunnableC1017a r1) {
                        r0 = this;
                        r0.f3686b = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r4 = this;
                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r4.f3686b
                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                        android.widget.ProgressBar r0 = r0.f3669a0
                        r1 = 25
                        r0.setProgress(r1)
                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r4.f3686b
                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                        android.widget.TextView r0 = r0.f3672d0
                        java.lang.String r1 = "Searching For Weak Signatures..."
                        r0.setText(r1)
                        me.createbitcoins.androidbitcoingenerator.c$f$a r0 = r4.f3686b
                        me.createbitcoins.androidbitcoingenerator.c$f r0 = r0.f3685b
                        me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                        android.os.Handler r0 = r0.f3668Z
                        me.createbitcoins.androidbitcoingenerator.c$f$a$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a$a
                        r1.<init>(r4)
                        r2 = 1000(0x3e8, double:4.94E-321)
                        r0.postDelayed(r1, r2)
                        return
                }
            }

            RunnableC1017a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1016f r1) {
                    r0 = this;
                    r0.f3685b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r4.f3685b
                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                    android.widget.ProgressBar r0 = r0.f3669a0
                    r1 = 22
                    r0.setProgress(r1)
                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r4.f3685b
                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                    android.widget.TextView r0 = r0.f3672d0
                    java.lang.String r1 = "Connected!!"
                    r0.setText(r1)
                    me.createbitcoins.androidbitcoingenerator.c$f r0 = r4.f3685b
                    me.createbitcoins.androidbitcoingenerator.c r0 = r0.f3684b
                    android.os.Handler r0 = r0.f3668Z
                    me.createbitcoins.androidbitcoingenerator.c$f$a$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a$a
                    r1.<init>(r4)
                    r2 = 1000(0x3e8, double:4.94E-321)
                    r0.postDelayed(r1, r2)
                    return
            }
        }

        RunnableC1016f(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r1) {
                r0 = this;
                r0.f3684b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                me.createbitcoins.androidbitcoingenerator.c r0 = r4.f3684b
                android.widget.ProgressBar r0 = r0.f3669a0
                r1 = 8
                r0.setProgress(r1)
                me.createbitcoins.androidbitcoingenerator.c r0 = r4.f3684b
                android.widget.TextView r0 = r0.f3672d0
                java.lang.String r1 = "Initializing..."
                r0.setText(r1)
                me.createbitcoins.androidbitcoingenerator.c r0 = r4.f3684b
                android.os.Handler r0 = r0.f3668Z
                me.createbitcoins.androidbitcoingenerator.c$f$a r1 = new me.createbitcoins.androidbitcoingenerator.c$f$a
                r1.<init>(r4)
                r2 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r1, r2)
                return
        }
    }

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$g */
    /* loaded from: classes.dex */
    private class AsyncTaskC1037g extends android.os.AsyncTask<java.lang.String, java.lang.String, java.lang.String> {

        /* renamed from: a */
        final /* synthetic */ me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c f3705a;

        private AsyncTaskC1037g(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r1) {
                r0 = this;
                r0.f3705a = r1
                r0.<init>()
                return
        }

        /* synthetic */ AsyncTaskC1037g(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r1, me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.RunnableC1011a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* renamed from: a */
        protected java.lang.String m0a(java.lang.String... r8) {
                r7 = this;
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch: all -> 0x0076, IOException -> 0x007b, MalformedURLException -> 0x008c
                r2 = 0
                r8 = r8[r2]     // Catch: all -> 0x0076, IOException -> 0x007b, MalformedURLException -> 0x008c
                r1.<init>(r8)     // Catch: all -> 0x0076, IOException -> 0x007b, MalformedURLException -> 0x008c
                java.net.URLConnection r8 = r1.openConnection()     // Catch: all -> 0x0076, IOException -> 0x007b, MalformedURLException -> 0x008c
                java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch: all -> 0x0076, IOException -> 0x007b, MalformedURLException -> 0x008c
                r8.connect()     // Catch: all -> 0x006c, IOException -> 0x0070, MalformedURLException -> 0x0073
                java.io.InputStream r1 = r8.getInputStream()     // Catch: all -> 0x006c, IOException -> 0x0070, MalformedURLException -> 0x0073
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: all -> 0x006c, IOException -> 0x0070, MalformedURLException -> 0x0073
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: all -> 0x006c, IOException -> 0x0070, MalformedURLException -> 0x0073
                r3.<init>(r1)     // Catch: all -> 0x006c, IOException -> 0x0070, MalformedURLException -> 0x0073
                r2.<init>(r3)     // Catch: all -> 0x006c, IOException -> 0x0070, MalformedURLException -> 0x0073
                java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                r1.<init>()     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
            L_0x0025:
                java.lang.String r3 = r2.readLine()     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                if (r3 == 0) goto L_0x0056
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                r4.<init>()     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                r4.append(r3)     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                java.lang.String r5 = "\n"
                r4.append(r5)     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                java.lang.String r4 = r4.toString()     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                r1.append(r4)     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                java.lang.String r4 = "Response: "
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                r5.<init>()     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                java.lang.String r6 = "> "
                r5.append(r6)     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                r5.append(r3)     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                java.lang.String r3 = r5.toString()     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                android.util.Log.d(r4, r3)     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                goto L_0x0025
            L_0x0056:
                java.lang.String r0 = r1.toString()     // Catch: IOException -> 0x0068, MalformedURLException -> 0x006a, all -> 0x00a2
                if (r8 == 0) goto L_0x005f
                r8.disconnect()
            L_0x005f:
                r2.close()     // Catch: IOException -> 0x0063
                goto L_0x0067
            L_0x0063:
                r8 = move-exception
                r8.printStackTrace()
            L_0x0067:
                return r0
            L_0x0068:
                r1 = move-exception
                goto L_0x007e
            L_0x006a:
                r1 = move-exception
                goto L_0x008f
            L_0x006c:
                r1 = move-exception
                r2 = r0
                r0 = r1
                goto L_0x00a3
            L_0x0070:
                r1 = move-exception
                r2 = r0
                goto L_0x007e
            L_0x0073:
                r1 = move-exception
                r2 = r0
                goto L_0x008f
            L_0x0076:
                r8 = move-exception
                r2 = r0
                r0 = r8
                r8 = r2
                goto L_0x00a3
            L_0x007b:
                r1 = move-exception
                r8 = r0
                r2 = r8
            L_0x007e:
                r1.printStackTrace()     // Catch: all -> 0x00a2
                if (r8 == 0) goto L_0x0086
                r8.disconnect()
            L_0x0086:
                if (r2 == 0) goto L_0x00a1
                r2.close()     // Catch: IOException -> 0x009d
                goto L_0x00a1
            L_0x008c:
                r1 = move-exception
                r8 = r0
                r2 = r8
            L_0x008f:
                r1.printStackTrace()     // Catch: all -> 0x00a2
                if (r8 == 0) goto L_0x0097
                r8.disconnect()
            L_0x0097:
                if (r2 == 0) goto L_0x00a1
                r2.close()     // Catch: IOException -> 0x009d
                goto L_0x00a1
            L_0x009d:
                r8 = move-exception
                r8.printStackTrace()
            L_0x00a1:
                return r0
            L_0x00a2:
                r0 = move-exception
            L_0x00a3:
                if (r8 == 0) goto L_0x00a8
                r8.disconnect()
            L_0x00a8:
                if (r2 == 0) goto L_0x00b2
                r2.close()     // Catch: IOException -> 0x00ae
                goto L_0x00b2
            L_0x00ae:
                r8 = move-exception
                r8.printStackTrace()
            L_0x00b2:
                goto L_0x00b4
            L_0x00b3:
                throw r0
            L_0x00b4:
                goto L_0x00b3
        }

        /* renamed from: a */
        protected void m1a(java.lang.String r3) {
                r2 = this;
                super.onPostExecute(r3)
                me.createbitcoins.androidbitcoingenerator.c r0 = r2.f3705a
                android.app.ProgressDialog r0 = r0.f3670b0
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x0014
                me.createbitcoins.androidbitcoingenerator.c r0 = r2.f3705a
                android.app.ProgressDialog r0 = r0.f3670b0
                r0.dismiss()
            L_0x0014:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: Exception -> 0x0043
                r0.<init>()     // Catch: Exception -> 0x0043
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: Exception -> 0x0043
                r1.<init>(r3)     // Catch: Exception -> 0x0043
                java.lang.String r3 = "bpi"
                org.json.JSONObject r3 = r1.getJSONObject(r3)     // Catch: Exception -> 0x0043
                java.lang.String r1 = "USD"
                org.json.JSONObject r3 = r3.getJSONObject(r1)     // Catch: Exception -> 0x0043
                java.lang.String r1 = "$"
                r0.append(r1)     // Catch: Exception -> 0x0043
                java.lang.String r1 = "rate"
                java.lang.String r3 = r3.getString(r1)     // Catch: Exception -> 0x0043
                r0.append(r3)     // Catch: Exception -> 0x0043
                me.createbitcoins.androidbitcoingenerator.c r3 = r2.f3705a     // Catch: Exception -> 0x0043
                android.widget.TextView r3 = r3.f3671c0     // Catch: Exception -> 0x0043
                java.lang.String r0 = r0.toString()     // Catch: Exception -> 0x0043
                r3.setText(r0)     // Catch: Exception -> 0x0043
            L_0x0043:
                return
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ java.lang.String doInBackground(java.lang.String[] r1) {
                r0 = this;
                java.lang.String[] r1 = (java.lang.String[]) r1
                java.lang.String r1 = r0.m0a(r1)
                return r1
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.m1a(r1)
                return
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
                r3 = this;
                super.onPreExecute()
                me.createbitcoins.androidbitcoingenerator.c r0 = r3.f3705a
                android.app.ProgressDialog r1 = new android.app.ProgressDialog
                a.j.a.d r2 = r0.m3219d()
                r1.<init>(r2)
                r0.f3670b0 = r1
                me.createbitcoins.androidbitcoingenerator.c r0 = r3.f3705a
                android.app.ProgressDialog r0 = r0.f3670b0
                java.lang.String r1 = "Initializing"
                r0.setMessage(r1)
                me.createbitcoins.androidbitcoingenerator.c r0 = r3.f3705a
                android.app.ProgressDialog r0 = r0.f3670b0
                r1 = 0
                r0.setCancelable(r1)
                me.createbitcoins.androidbitcoingenerator.c r0 = r3.f3705a
                android.app.ProgressDialog r0 = r0.f3670b0
                r0.show()
                return
        }
    }

    public View$OnClickListenerC1010c() {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.f3668Z = r0
            me.createbitcoins.androidbitcoingenerator.d r0 = new me.createbitcoins.androidbitcoingenerator.d
            r0.<init>()
            r1.f3674f0 = r0
            me.createbitcoins.androidbitcoingenerator.c$e r0 = new me.createbitcoins.androidbitcoingenerator.c$e
            r0.<init>(r1)
            r1.f3675g0 = r0
            me.createbitcoins.androidbitcoingenerator.c$f r0 = new me.createbitcoins.androidbitcoingenerator.c$f
            r0.<init>(r1)
            r1.f3676h0 = r0
            return
    }

    /* renamed from: a */
    static /* synthetic */ void m9a(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r0) {
            r0.m5b0()
            return
    }

    /* renamed from: a0 */
    public static me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c m8a0() {
            me.createbitcoins.androidbitcoingenerator.c r0 = me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.f3667i0
            return r0
    }

    /* renamed from: b */
    static /* synthetic */ void m6b(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r0) {
            r0.m3c0()
            return
    }

    /* renamed from: b */
    public static boolean m7b(android.content.Context r4) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            r0 = 0
            if (r4 != 0) goto L_0x000c
            return r0
        L_0x000c:
            android.net.NetworkInfo[] r4 = r4.getAllNetworkInfo()
            if (r4 == 0) goto L_0x0025
            r1 = 0
        L_0x0013:
            int r2 = r4.length
            if (r1 >= r2) goto L_0x0025
            r2 = r4[r1]
            android.net.NetworkInfo$State r2 = r2.getState()
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED
            if (r2 != r3) goto L_0x0022
            r4 = 1
            return r4
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x0025:
            return r0
    }

    /* renamed from: b0 */
    private void m5b0() {
            r4 = this;
            android.content.res.Resources r0 = r4.m3188t()
            r1 = 2131689520(0x7f0f0030, float:1.9008058E38)
            java.lang.String r0 = r0.getString(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SENDTO"
            r1.<init>(r2)
            java.lang.String r2 = "mailto:robslay90@gmail.com"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.setData(r2)
            java.lang.String r2 = "android.intent.extra.SUBJECT"
            java.lang.String r3 = "To Buy Unique ID for Android Bitcoin Generator"
            r1.putExtra(r2, r3)
            java.lang.String r2 = "android.intent.extra.TEXT"
            r1.putExtra(r2, r0)
            r4.m3244a(r1)
            return
    }

    /* renamed from: c */
    static /* synthetic */ java.lang.Runnable m4c(me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c r0) {
            java.lang.Runnable r0 = r0.f3675g0
            return r0
    }

    /* renamed from: c0 */
    private void m3c0() {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r3.m3202j()
            r0.<init>(r1)
            java.lang.String r1 = "Incorrect Unique ID !!!"
            r0.setTitle(r1)
            r1 = 1
            r0.setCancelable(r1)
            android.content.res.Resources r1 = r3.m3188t()
            r2 = 2131689511(0x7f0f0027, float:1.900804E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setMessage(r1)
            me.createbitcoins.androidbitcoingenerator.c$b r1 = new me.createbitcoins.androidbitcoingenerator.c$b
            r1.<init>(r3)
            java.lang.String r2 = "Yes"
            r0.setPositiveButton(r2, r1)
            java.lang.String r1 = "Cancel"
            r2 = 0
            r0.setNegativeButton(r1, r2)
            r0.show()
            return
    }

    /* renamed from: d0 */
    private void m2d0() {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r3.m3202j()
            r0.<init>(r1)
            java.lang.String r1 = "Incorrect Unique ID !!!"
            r0.setTitle(r1)
            r1 = 1
            r0.setCancelable(r1)
            android.content.res.Resources r1 = r3.m3188t()
            r2 = 2131689512(0x7f0f0028, float:1.9008041E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setMessage(r1)
            me.createbitcoins.androidbitcoingenerator.c$c r1 = new me.createbitcoins.androidbitcoingenerator.c$c
            r1.<init>(r3)
            java.lang.String r2 = "Exit"
            r0.setPositiveButton(r2, r1)
            me.createbitcoins.androidbitcoingenerator.c$d r1 = new me.createbitcoins.androidbitcoingenerator.c$d
            r1.<init>(r3)
            java.lang.String r2 = "Pay"
            r0.setNegativeButton(r2, r1)
            r0.show()
            return
    }

    @Override // p000a.p036j.p037a.ComponentCallbacksC0248c
    /* renamed from: G */
    public void mo13G() {
            r2 = this;
            super.mo13G()
            android.content.Context r0 = r2.m3202j()
            me.createbitcoins.androidbitcoingenerator.d r1 = r2.f3674f0
            r0.unregisterReceiver(r1)
            return
    }

    /* renamed from: Z */
    public boolean m12Z() {
            r4 = this;
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r1 = 0
            android.widget.ProgressBar r2 = r4.f3669a0     // Catch: InterruptedException -> 0x0020, IOException -> 0x0025
            r3 = 3
            r2.setProgress(r3)     // Catch: InterruptedException -> 0x0020, IOException -> 0x0025
            android.widget.TextView r2 = r4.f3672d0     // Catch: InterruptedException -> 0x0020, IOException -> 0x0025
            java.lang.String r3 = "Pinging Bitcoin Network Nodes..."
            r2.setText(r3)     // Catch: InterruptedException -> 0x0020, IOException -> 0x0025
            java.lang.String r2 = "/system/bin/ping -c 1 -W 4 8.8.8.8"
            java.lang.Process r0 = r0.exec(r2)     // Catch: InterruptedException -> 0x0020, IOException -> 0x0025
            int r0 = r0.waitFor()     // Catch: InterruptedException -> 0x0020, IOException -> 0x0025
            if (r0 != 0) goto L_0x001f
            r1 = 1
        L_0x001f:
            return r1
        L_0x0020:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0029
        L_0x0025:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0029:
            android.widget.ProgressBar r0 = r4.f3669a0
            r0.setProgress(r1)
            android.widget.TextView r0 = r4.f3672d0
            java.lang.String r2 = "Failed To Connect to the Internet!!"
            r0.setText(r2)
            return r1
    }

    @Override // p000a.p036j.p037a.ComponentCallbacksC0248c
    /* renamed from: a */
    public android.view.View mo11a(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.f3667i0 = r3
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            r6.<init>(r0)
            android.content.Context r0 = r3.m3202j()
            me.createbitcoins.androidbitcoingenerator.d r1 = r3.f3674f0
            r0.registerReceiver(r1, r6)
            me.createbitcoins.androidbitcoingenerator.c$g r6 = new me.createbitcoins.androidbitcoingenerator.c$g
            r0 = 0
            r6.<init>(r3, r0)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "https://api.coindesk.com/v1/bpi/currentprice.json"
            r0[r1] = r2
            r6.execute(r0)
            r6 = 2131492909(0x7f0c002d, float:1.8609283E38)
            android.view.View r4 = r4.inflate(r6, r5, r1)
            r5 = 2131296396(0x7f09008c, float:1.8210707E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            r3.f3669a0 = r5
            r5 = 2131296397(0x7f09008d, float:1.821071E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.f3672d0 = r5
            r5 = 2131296395(0x7f09008b, float:1.8210705E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.f3671c0 = r5
            r5 = 2131296327(0x7f090047, float:1.8210568E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r3.f3673e0 = r5
            r5 = 2131296295(0x7f090027, float:1.8210503E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r5.setOnClickListener(r3)
            return r4
    }

    /* renamed from: a */
    public void m10a(java.lang.String r3, int r4) {
            r2 = this;
            a.j.a.d r0 = r2.m3219d()
            me.createbitcoins.androidbitcoingenerator.c$a r1 = new me.createbitcoins.androidbitcoingenerator.c$a
            r1.<init>(r2, r3, r4)
            r0.runOnUiThread(r1)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            int r5 = r5.getId()
            r0 = 2131296295(0x7f090027, float:1.8210503E38)
            if (r5 == r0) goto L_0x000b
            goto L_0x00a1
        L_0x000b:
            android.widget.ProgressBar r5 = r4.f3669a0
            int r5 = r5.getProgress()
            r0 = 75
            if (r5 != r0) goto L_0x001a
            r4.m2d0()
            goto L_0x00a1
        L_0x001a:
            android.widget.EditText r5 = r4.f3673e0
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            int r5 = r5.length()
            r0 = 1
            java.lang.String r1 = "You must be connected to the internet before you can generate btc"
            java.lang.String r2 = "Enter a valid address so you can receive your bitcoins"
            r3 = 24
            if (r5 > r3) goto L_0x004f
            android.content.Context r5 = r4.m3202j()
            boolean r5 = m7b(r5)
            if (r5 != 0) goto L_0x004f
            android.widget.EditText r5 = r4.f3673e0
            r5.setError(r2)
            android.content.Context r5 = r4.m3202j()
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r0)
            r5.show()
        L_0x004f:
            android.widget.EditText r5 = r4.f3673e0
            android.text.Editable r5 = r5.getText()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x009c
            android.widget.EditText r5 = r4.f3673e0
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            int r5 = r5.length()
            if (r5 > r3) goto L_0x0070
            goto L_0x009c
        L_0x0070:
            android.content.Context r5 = r4.m3202j()
            boolean r5 = m7b(r5)
            if (r5 == 0) goto L_0x0090
            android.widget.ProgressBar r5 = r4.f3669a0
            r0 = 0
            r5.setVisibility(r0)
            boolean r5 = r4.m12Z()
            if (r5 == 0) goto L_0x00a1
            android.os.Handler r5 = r4.f3668Z
            java.lang.Runnable r0 = r4.f3676h0
            r1 = 3000(0xbb8, double:1.482E-320)
            r5.postDelayed(r0, r1)
            goto L_0x00a1
        L_0x0090:
            android.content.Context r5 = r4.m3202j()
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r0)
            r5.show()
            goto L_0x00a1
        L_0x009c:
            android.widget.EditText r5 = r4.f3673e0
            r5.setError(r2)
        L_0x00a1:
            return
    }
}
