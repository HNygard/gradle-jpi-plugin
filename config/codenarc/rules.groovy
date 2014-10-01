ruleset {
    ruleset('rulesets/basic.xml')

    ruleset('rulesets/braces.xml')

    ruleset('rulesets/concurrency.xml')

    ruleset('rulesets/convention.xml')

    ruleset('rulesets/design.xml')

    ruleset('rulesets/dry.xml')

    // these rules cause compilation failure warnings
    // ruleset('rulesets/enhanced.xml')

    ruleset('rulesets/exceptions.xml')

    ruleset('rulesets/formatting.xml') {
        // enforce at least one space after map entry colon
        SpaceAroundMapEntryColon {
            characterAfterColonRegex = /\s/
            characterBeforeColonRegex = /./
        }

        // we don't care for now
        exclude 'ClassJavadoc'
    }

    ruleset('rulesets/generic.xml')

    ruleset('rulesets/groovyism.xml')

    ruleset('rulesets/imports.xml') {
        // we order static imports after other imports because that's the default style in IDEA
        MisorderedStaticImports {
            comesBefore = false
        }
    }

    ruleset('rulesets/logging.xml')

    ruleset('rulesets/naming.xml')

    ruleset('rulesets/security.xml')

    ruleset('rulesets/serialization.xml')

    ruleset('rulesets/size.xml') {
        // we have no Cobertura coverage file yet
        exclude 'CrapMetric'
    }

    ruleset('rulesets/unnecessary.xml')

    ruleset('rulesets/unused.xml')
}