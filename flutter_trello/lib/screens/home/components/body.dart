import 'package:flutter/material.dart';

import '../../../size_config.dart';
import 'categories.dart';
import 'work_space.dart';
import 'home_header.dart';
import 'popular_product.dart';
import 'list_project.dart';

class Body extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: SingleChildScrollView(
        child: Column(
          children: [
            SizedBox(height: getProportionateScreenHeight(20)),
            HomeHeader(),
            SizedBox(height: getProportionateScreenWidth(10)),
            WorkSpace(),
            SizedBox(height: getProportionateScreenWidth(20)),
            // Categories(),
            ListProjects(),
            SizedBox(height: getProportionateScreenWidth(30)),
            // PopularProducts(),
            // SizedBox(height: getProportionateScreenWidth(30)),
          ],
        ),
      ),
    );
  }
}
