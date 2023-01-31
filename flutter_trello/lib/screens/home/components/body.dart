import 'package:flutter/material.dart';
import 'package:flutter_trello/components/task.dart';
import 'package:flutter_trello/constants.dart';
import 'package:flutter_trello/main.dart';
import 'package:flutter_trello/screens/home/widgets/task_widget.dart';
import 'package:flutter_trello/utils/constanst.dart';
import 'package:flutter_trello/utils/strings.dart';
import 'package:flutter_slider_drawer/flutter_slider_drawer.dart';
import 'package:animate_do/animate_do.dart';
import 'package:hive_flutter/hive_flutter.dart';
import 'package:lottie/lottie.dart';

import '../../../size_config.dart';
import 'categories.dart';
import 'work_space.dart';
import 'home_header.dart';
import 'func_project.dart';
import 'list_project.dart';

class Body extends StatefulWidget {
  @override
  State<Body> createState() => _BodyState();
}

class _BodyState extends State<Body> {
  GlobalKey<SliderDrawerState> dKey = GlobalKey<SliderDrawerState>();
  @override
  Widget build(BuildContext context) {
    SizeConfig().init(context);

    final base = BaseWidget.of(context);
    var textTheme = Theme.of(context).textTheme;
    return ValueListenableBuilder(
        valueListenable: base.dataStore.listenToTask(),
        builder: (ctx, Box<Task> box, Widget? child) {
          var tasks = box.values.toList();
          tasks.sort(((a, b) => a.createdAtDate.compareTo(b.createdAtDate)));
          return SafeArea(
            child: SingleChildScrollView(
              child: Column(
                children: [
                  SizedBox(height: getProportionateScreenHeight(20)),
                  HomeHeader(),
                  SizedBox(height: getProportionateScreenWidth(10)),
                  ListProjects(),
                  SizedBox(height: getProportionateScreenWidth(30)),
                  WorkSpace(tasks, textTheme, base),
                ],
              ),
            ),
          );
        });
  }
}
