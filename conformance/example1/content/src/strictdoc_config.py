from strictdoc.core.project_config import ProjectConfig


def create_config() -> ProjectConfig:
    config = ProjectConfig(
        project_title="SPDX Regulation Conformance Example 1: SEBoK Product as System : Commodity Consumer Electronics",
        dir_for_sdoc_assets="assets",
        dir_for_sdoc_cache="output/_cache",

        project_features=[
            # Stable features.
            "DEEP_TRACEABILITY_SCREEN",
            # "MATHJAX",  - not used by this project
            "SEARCH",
            "TABLE_SCREEN",
            "TRACEABILITY_SCREEN",

            # Experimental features
            "DIFF",
            "HTML2PDF",
            "MERMAID",
            "PROJECT_STATISTICS_SCREEN",
            # "REQIF",
            # "REQUIREMENT_TO_SOURCE_TRACEABILITY",
            # "SOURCE_FILE_LANGUAGE_PARSERS",
            # "STANDALONE_DOCUMENT_SCREEN",
            "TRACEABILITY_MATRIX_SCREEN",
        ],

        include_doc_paths=[
            "/*",
            "/*/sdoc/**",
        ],

        exclude_doc_paths=[
            "/.*/",
            "/output",
        ],

        include_source_paths=[
        ],

        exclude_source_paths=[
        ],

        grammars={
            "@sample_stakeholders_grammar": "shared/sdoc/grammars/sample_stakeholders.sgra",
            "@sample_personas_grammar": "shared/sdoc/grammars/sample_personas.sgra",
            "@sample_stakeholder_needs_grammar": "shared/sdoc/grammars/sample_stakeholder_needs.sgra",
            "@sample_stakeholder_requirements_grammar": "shared/sdoc/grammars/sample_stakeholder_requirements.sgra",
            "@sample_system_concept_of_operations_grammar": "shared/sdoc/grammars/sample_system_concept_of_operations.sgra",
            "@sample_system_validations_grammar": "shared/sdoc/grammars/sample_system_validations.sgra",
            "@sample_interface_specifications_grammar": "shared/sdoc/grammars/sample_interface_specifications.sgra",
            "@sample_system_requirements_grammar": "shared/sdoc/grammars/sample_system_requirements.sgra",
            "@sample_system_verifications_grammar": "shared/sdoc/grammars/sample_system_verifications.sgra",
        },

        # test_report_root_dict={
        #     "reports/tests_integration.lit.junit.xml": "tests/integration",
        #     "reports/tests_integration_html2pdf.lit.junit.xml": "tests/integration",
        # },

        # Waiting for a fix to be released soon.
        html2pdf_strict=False,
        reqif_multiline_is_xhtml=True,
        reqif_enable_mid=True,
        section_behavior="[[SECTION]]",
        statistics_generator="docs.sdoc_project_statistics.SDocStatisticsGenerator",
    )
    return config

